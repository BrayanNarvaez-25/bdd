package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestamo p = new Prestamo("1727392035",new BigDecimal(512.32));
		Persona per = new Persona("1727392035","Brayan","Narváez",p);
		try {
			per.setNombre("Diego");
			per.setApellido("Diaz");
			per.setEstatura(1.73);
			Date fechaNacimiento = Convertidor.convertirFecha("2008/05/15");
			Date horaNacimineto = Convertidor.convertirHora("13:56");
			per.setFechaNacimiento(fechaNacimiento);
			per.setHoraNacimiento(horaNacimineto);
			per.setCantidadAhorrada(new BigDecimal(1203.53));
			per.setNumeroHijos(1);
			AdminPersonas.actualizar(per);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " +e.getMessage());
		}
		
		
	}

}
