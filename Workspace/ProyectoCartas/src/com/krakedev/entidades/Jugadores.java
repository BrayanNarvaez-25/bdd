package com.krakedev.entidades;

import java.util.ArrayList;

public class Jugadores {
	    
	    // Atributo solicitado
	    private ArrayList<String> nombresJugadores;
	    
	    public Jugadores() {
	        this.nombresJugadores = new ArrayList<>();
	    }

	    // Getters y Setters
	    public ArrayList<String> getNombresJugadores() {
	        return nombresJugadores;
	    }

	    public void setNombresJugadores(ArrayList<String> nombresJugadores) {
	        this.nombresJugadores = nombresJugadores;
	    }
	    
	    // Método solicitado para agregar tres jugadores
	    public void agregarTresJugadores() {
	        this.nombresJugadores.add("Jugador A");
	        this.nombresJugadores.add("Jugador B");
	        this.nombresJugadores.add("Jugador C");
	    }
	}
