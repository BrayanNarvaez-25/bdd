package com.krakedev.entidades;

public class Carta {
	
	private int numero;
	private String palo;
	private String estado;
	
	
	
	public String mostrarInfo() {
		return numero +"-" + palo;
	}
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		this.estado = "N";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
