package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		int areaC1;
		int perC1;
		int areaC2;
		int perC2;
		int areaC3;
		int perC3;
		
		c1.lado = 5;
		areaC1 = c1.calcularArea();
		System.out.println("El area del c1 es: "+areaC1);
		perC1 = c1.calcularPerimetro();
		System.out.println("El perímetro del c1 es: "+perC1);
		
		System.out.println("************");
		
		c2.lado = 8;
		areaC2 = c2.calcularArea();
		System.out.println("El area del c2 es: "+areaC2);
		perC2 = c2.calcularPerimetro();
		System.out.println("El perímetro del c1 es: "+perC2);
		
		System.out.println("************");
		
		c3.lado = 9;
		areaC3 = c3.calcularArea();
		System.out.println("El area del c3 es: "+areaC3);
		perC3 = c3.calcularPerimetro();
		System.out.println("El perímetro del c1 es: "+perC3);
	}
}
