package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Brayan");
		Estudiante estudiante2 = new Estudiante("Pepe");
		Estudiante estudiante3 = new Estudiante("Diego");
	
		estudiante1.calificar(10);
		estudiante2.calificar(5);
		estudiante3.calificar(-1);
	}

}
