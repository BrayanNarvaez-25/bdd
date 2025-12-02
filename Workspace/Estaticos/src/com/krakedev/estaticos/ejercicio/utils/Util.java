package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	
	public static String formatearHora(int numero) {
		String valor = numero + "";
		if(valor.length() == 1) {
			return "0" + valor;
		}else {
			return valor;
		}
	}
	
	public static String formatearDia(int numero) {
		if(numero == 0) {
			return "LUNES";
		}else if(numero == 1) {
			return "MARTES";
		}else if(numero == 2) {
			return "MIERCOLES";
		}else if(numero == 3) {
			return "JUEVES";
		}else if(numero == 4) {
			return "VIERNES";
		}else if(numero == 5) {
			return "SABADO";
		}else {
			return "DOMINGO";
		}
	}
}
