package com.krakedev.herencia;

public class Gato extends Animal{
	
	@Override 
	public void dormir() {
		System.out.println("Gato durmiento");
	}
	
	public void maullando() {
		System.out.println("Gato maullando");
	}
	
	public void maullando(String adjetivo) {
		System.out.println("Gato maullando " + adjetivo);
	}
}
