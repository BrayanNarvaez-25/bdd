package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;


public class TestAdminPersona {

	public static void main(String[] args) {
		Prestamo p = new Prestamo("1727392035",new BigDecimal(512.32));
		Persona per = new Persona("1727392035","Brayan","Narváez",p);
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("2007/11/25");
			Date horaNacimineto = Convertidor.convertirHora("13:56");
			per.setFechaNacimiento(fechaNacimiento);
			per.setHoraNacimiento(horaNacimineto);
			per.setCantidadAhorrada(new BigDecimal(1203.53));
			per.setNumeroHijos(1);
			AdminPersonas.insertar(per);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " +e.getMessage());
		}
		
		
	}

}
