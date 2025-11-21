package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int areaR1;
		int areaR2;
		double per1;
		double per2;
		
		r1.base = 10;
		r1.altura = 5;
		areaR1 = r1.calcularArea();
		System.out.println("Area del r1 es: "+areaR1);
		per1 = r1.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per1);
		
		r2.base = 4;
		r2.altura = 2;
		areaR2 = r2.calcularArea();
		System.out.println("Area del r2 es: "+areaR2);
		per2 = r2.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per2);
		
	}

}
