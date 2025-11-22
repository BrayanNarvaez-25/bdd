package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoProm;
		
		resultadoSuma = calcu.sumar(5,3);
		System.out.println("Resultado Suma: " + resultadoSuma);
	
		System.out.println("***************");
		
		resultadoResta = calcu.restar(10, 3);
		System.out.println("Resultado Resta: " + resultadoResta);
		
		System.out.println("***************");
	
		resultadoMultiplicar = calcu.multiplicar(3, 4);
		System.out.println("Resultado Multiplicación: "+ resultadoMultiplicar);
		
		System.out.println("***************");
	
		resultadoDividir = calcu.dividir(6, 4);
		System.out.println("Resultado División: "+ resultadoDividir);
		
		System.out.println("***************");
		
		resultadoProm = calcu.promediar(4, 6, 8);
		System.out.println("Resultado Promedio: "+ resultadoProm);
		
		System.out.println("***************");
		
		calcu.mostrarResultado();
	}

}
