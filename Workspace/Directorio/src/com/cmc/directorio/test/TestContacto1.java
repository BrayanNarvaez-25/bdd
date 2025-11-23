package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Contacto mp;
		boolean co;
		Telefono telef = new Telefono("movi", "0992989201", 8);
		Telefono telef2 = new Telefono("claro", "0938288283", 5);

		AdminContacto admin = new AdminContacto();
		Contacto c = new Contacto("Brayan", "Narváez", telef, 64);
		Contacto c2 = new Contacto("Diego", "Mendez", telef2, 66);

		mp = admin.buscarMasPesado(c, c2);
		if (mp == null) {
			System.out.println("Son Iguales");
		} else {
			System.out.println("El más pesado es: " + mp.getNombre() + " " + mp.getApellido() + " " + mp.getPeso());
		}
		
		co = admin.compararOperadoras(telef, telef2);
		if(co == true) {
			System.out.println("Tienen la misma operadora");
		}else {
			System.out.println("Tienen operadoras distintas");
		}
	}

}