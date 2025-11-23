package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi","0992989201",5);
		Telefono t2 = new Telefono("claro","0932384823",5);
		Telefono t3 = new Telefono("movi","0945483847",5);
		Telefono t4 = new Telefono("claro","0987328487",5);

		AdminTelefono ad1 = new AdminTelefono();
		AdminTelefono ad2 = new AdminTelefono();
		
		int contadorMovi = ad1.contarMovi(t1,t2,t3);
		System.out.println("La cantidad de telefonos con movi es: "+contadorMovi);
	
		int contadorClaro = ad2.contarClaro(t1, t2, t3, t4);
		System.out.println("La cantidad de telefonos con claro es: "+contadorClaro);
	}
}
