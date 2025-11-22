package com.cmc.repaso.entidades;

public class Validacion {

	public boolean validarMonto(double monto) {
		if(monto > 0) {
			System.out.println("TRUE");
			return true; 
		}else{
			System.out.println("FALSE");
			return false;
		}
	}
}
