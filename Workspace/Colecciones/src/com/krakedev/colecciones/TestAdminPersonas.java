package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {

		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti", 50));
		admin.agregar(new Persona("Pepe", "Mendoza", 19));
		admin.agregar(new Persona("Dario", "Perez", 32));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Dario");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getApellido() + " " + p1.getEdad());
		} else {
			System.out.println("No existe la persona con ese nombre");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("Mayores: "+personasMayores.size());
	}

}
