package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public int calcularArea () {
		int resultado = lado * lado;
		return resultado;
	}
	
	public int calcularPerimetro() {
		int resultado = lado * 4;
		return resultado;
	}
}
