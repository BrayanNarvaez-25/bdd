package com.krakedev.colecciones;

public class Persona {
	private String nombre;
	private String apellido;
	private int Edad;
	
	public Persona(String nombre, String apellido,int Edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.Edad = Edad;
	}
	
	

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
}
