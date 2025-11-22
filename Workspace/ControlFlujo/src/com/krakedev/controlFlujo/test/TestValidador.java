package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador1 = new Validador();
		validador1.validarEdad(10);
		validador1.validarEdad(18);
		validador1.validarEdad(20);
		validador1.validarEdad(4);
		validador1.validarEdad(-1);
	}

}
