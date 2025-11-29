package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

public ArrayList<Carta> barajar() {
        
        ArrayList<Carta> auxiliar = new ArrayList<>();
        
        for (int i = 1; i <= 100; i++) {
            
            int posicionAleatoria = Random.obtenerPosicion();
            
            Carta cartaEncontrada = this.cartas.get(posicionAleatoria);
            
            if (cartaEncontrada.getEstado().equals("N")) {

                auxiliar.add(cartaEncontrada);
                cartaEncontrada.setEstado("C");
            } 
        }
        
        for (Carta carta : this.cartas) {
            
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
            }
            carta.setEstado("N"); 
        }
        return auxiliar;
    }

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public Naipe() {
		this.numerosPosibles = new ArrayList<>();
		this.cartas = new ArrayList<>();

		this.numerosPosibles.add(new Numero("A", 11));

		for (int i = 2; i <= 10; i++) {
			this.numerosPosibles.add(new Numero(String.valueOf(i), i));
		}

		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));

		Palos palos = new Palos();
		ArrayList<String> palosDisponibles = new ArrayList<>();
		palosDisponibles.add(palos.getCorazonRojo());
		palosDisponibles.add(palos.getCorazonNegro());
		palosDisponibles.add(palos.getDiamante());
		palosDisponibles.add(palos.getTrebol());

		for (String palo : palosDisponibles) {
			for (Numero num : this.numerosPosibles) {
				Carta nuevaCarta = new Carta(num.getValor(), palo);
				this.cartas.add(nuevaCarta);
			}
		}
	}
}
