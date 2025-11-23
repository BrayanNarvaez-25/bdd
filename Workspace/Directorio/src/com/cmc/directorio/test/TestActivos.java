package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		boolean activar;
		Telefono telef = new Telefono("movi", "0992989201", 8);
		AdminContacto admin = new AdminContacto();
		Contacto c = new Contacto("Brayan", "Narváez", telef, 64);
		telef.imprimirTodo();
		System.out.println("******************************");
		activar = admin.activarUsuario(telef,c);
		System.out.println("Actividad: "+activar);
	}

}
