package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestamo p = new Prestamo("1727392035",new BigDecimal(512.32));
		Persona per = new Persona("1727392035","Brayan","Narváez",p);
		try {
			AdminPersonas.eliminar(per.getCedula());
		} catch (Exception e) {
			System.out.println("Error en el sistema: " +e.getMessage());
		}
	}

}
