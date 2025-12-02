package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	
	private ArrayList<Alarma> alarma;

	public ArrayList<Alarma> getAlarma() {
		return alarma;
	}
	
	public void agregarAlarma(Alarma alarma) {
		this.alarma.add(alarma);
	}
	
	public AdminAlarmas() {
        this.alarma = new ArrayList<>();
    }
}
