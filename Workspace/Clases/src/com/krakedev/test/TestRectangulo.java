package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(3,5);
		Rectangulo r2 = new Rectangulo(6,3);
		int areaR1;
		int areaR2;
		double per1;
		double per2;
		
		areaR1 = r1.calcularArea();
		System.out.println("Area del r1 es: "+areaR1);
		per1 = r1.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per1);
		
		System.out.println("*****************");
		
		areaR2 = r2.calcularArea();
		System.out.println("Area del r2 es: "+areaR2);
		per2 = r2.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per2);
		
	}
}
