package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.entidades.Naipe;

public class Juego {

	// Atributos solicitados
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> idsJugadores;

	public Juego(ArrayList<String> idsJugadores) {

		this.idsJugadores = idsJugadores;
		this.cartasJugadores = new ArrayList<>();

		for (String id : idsJugadores) {

			ArrayList<Carta> cartasDelJugador = new ArrayList<>();
			this.cartasJugadores.add(cartasDelJugador);
		}

	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public ArrayList<Carta> getNaipeBarajado() {
		if (this.naipe == null) {
			this.naipe = new Naipe();
		}

		if (this.naipeBarajado == null) {
			this.naipeBarajado = this.naipe.barajar();
		}

		return naipeBarajado;
	}

	public void entregarCartas(int cartasPorJugador) {

		getNaipeBarajado();

		int numJugadores = this.cartasJugadores.size();
		for (int i = 0; i < cartasPorJugador; i++) {

			for (int j = 0; j < numJugadores; j++) {

				int indiceCarta = (i * numJugadores) + j;

				if (indiceCarta < this.naipeBarajado.size()) {

					Carta cartaAEntregar = this.naipeBarajado.get(indiceCarta);

					this.cartasJugadores.get(j).add(cartaAEntregar);
				} else {
					System.out.println("ADVERTENCIA: Se acabaron las cartas en la baraja barajada.");
					return;
				}
			}
		}
	}

	public String determinarGanador(ArrayList<String> nombresJugadores) {

		String ganador = "Nadie";
		int puntuacionMaxima = -1;

		System.out.println("\n--- RESULTADOS DEL JUEGO ---");

		for (int i = 0; i < this.cartasJugadores.size(); i++) {

			String nombreJugador = nombresJugadores.get(i);
			ArrayList<Carta> manoDelJugador = this.cartasJugadores.get(i);
			int total = 0;

			for (Carta carta : manoDelJugador) {
				total += carta.getNumero();
			}

			System.out.println("Jugador " + (i + 1) + " (" + nombreJugador + "): Total = " + total);
			if (total > puntuacionMaxima) {
				puntuacionMaxima = total;
				ganador = nombreJugador;
			}
		}

		return ganador;
	}

	public int devolverTotal(int indiceJugador) {
		int total = 0;

		if (indiceJugador < 0 || indiceJugador >= this.cartasJugadores.size()) {
			System.out.println("ERROR: Índice de jugador " + indiceJugador + " fuera de rango.");
			return 0;
		}
		ArrayList<Carta> manoDelJugador = this.cartasJugadores.get(indiceJugador);
		for (Carta carta : manoDelJugador) {
			total += carta.getNumero();
		}

		return total;
	}

	public String determinarGanador() {

		if (this.idsJugadores == null || this.idsJugadores.isEmpty()) {
			return "No hay jugadores en el juego.";
		}
		String idGanador = this.idsJugadores.get(0);
		int sumaGanador = devolverTotal(0);
		for (int i = 1; i < this.idsJugadores.size(); i++) {

			String idJugadorActual = this.idsJugadores.get(i);
			int sumaActual = devolverTotal(i);
			if (sumaActual >= sumaGanador) {
				sumaGanador = sumaActual;
				idGanador = idJugadorActual;
			}
		}

		System.out.println("------------------------------------");
		return idGanador;
	}
}
