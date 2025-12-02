package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {

		Alarma a1 = new Alarma(DiasSemana.LUNES, 5, 32);
		Alarma a2 = new Alarma(DiasSemana.MARTES, 8, 12);
		Alarma a3 = new Alarma(DiasSemana.MIERCOLES, 6, 42);
		Alarma a4 = new Alarma(DiasSemana.JUEVES, 1, 32);
		Alarma a5 = new Alarma(DiasSemana.VIERNES, 4, 32);
		Alarma a6 = new Alarma(DiasSemana.SABADO, 2, 17);
		Alarma a7 = new Alarma(DiasSemana.DOMINGO, 3, 59);

		AdminAlarmas admin = new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		admin.agregarAlarma(a5);
		admin.agregarAlarma(a6);
		admin.agregarAlarma(a7);

		ArrayList<Alarma> alarmasActuales = admin.getAlarma();
		System.out.println(alarmasActuales);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
	}
}
