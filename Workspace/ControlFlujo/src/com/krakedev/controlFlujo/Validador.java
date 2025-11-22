package com.krakedev.controlFlujo;

public class Validador {
	
	public void validarEdad(int edad) {
		if(edad >=18) {
			System.out.println("ES MAYOR DE EDAD");
		}else if(edad >= 12 && edad < 18){
			System.out.println("ES ADOLESCENTE");
		}else if(edad > 0 && edad <12) {
			System.out.println("ES NIÑO");
		}else {
			System.out.println("EDAD INCORRECTA");
		}
	}
}
