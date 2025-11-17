package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo persona
		p = new Persona();// 2. Crear un objeto Persona,p referencia apunta al objeto
		Persona p2 = new Persona();

		// 3. Accedo a los atributos
		p.nombre = "Gabi";
		System.out.println("nombre: " + p.nombre);
		System.out.println("nombre: " + p.edadPersona);
		System.out.println("nombre: " + p.estatura);

		p2.nombre = "Pepe";

		System.out.println("******");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
		
		System.out.println("******************");
		// 5. Modificar los atributos
		p.nombre = "Luis";
		p.edadPersona = 45;
		p.estatura = 1.69;

		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edadPersona);
		System.out.println("Estatura: " + p.estatura);

	}

}
