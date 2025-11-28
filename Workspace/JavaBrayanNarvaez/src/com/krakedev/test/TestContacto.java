package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");
        Direccion dirInicial = new Direccion("Av. siempre Viva", "Calle 4");
        contacto.setDireccion(dirInicial);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
        
        
        System.out.println("-------------------------------------");
        
        
        // Settear la dirección
        System.out.println("Información del Contacto (actualizada)");
        Direccion dirActualizada = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto.setCedula("9876543210");
        contacto.setNombre("Ana");
        contacto.setApellido("Gómez");
        contacto.setDireccion(dirActualizada);
        contacto.imprimir();
    }
}

