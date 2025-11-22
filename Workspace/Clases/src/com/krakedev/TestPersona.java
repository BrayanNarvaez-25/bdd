package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo persona
		p = new Persona();// 2. Crear un objeto Persona,p referencia apunta al objeto
		Persona p2 = new Persona();

		// 3. Accedo a los atributos
		p.setNombre("Gabi");
		System.out.println("nombre: " + p.getNombre());
		System.out.println("nombre: " + p.getEdadPersona());
		System.out.println("nombre: " + p.getEstatura());

		p2.setNombre("Pepe");;

		System.out.println("******");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
		
		System.out.println("******************");
		// 5. Modificar los atributos
		p.setNombre("Diego");;
		p.setEdadPersona(23);;
		p.setEstatura(1.74);;

		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdadPersona());
		System.out.println("Estatura: " + p.getEstatura());

	}

}
