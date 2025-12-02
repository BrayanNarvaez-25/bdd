package com.krakedev.herencia;

public class Perro extends Animal {
	
	public void ladrad() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmiendo");
	}
	
	public Perro() {
		System.out.println("Ejecutar constructor de perro");
	}
}
