package com.krakedev;

public class Cuadrado {
	
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public int calcularArea () {
		int resultado = lado * lado;
		return resultado;
	}
	
	public int calcularPerimetro() {
		int resultado = lado * 4;
		return resultado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
}
