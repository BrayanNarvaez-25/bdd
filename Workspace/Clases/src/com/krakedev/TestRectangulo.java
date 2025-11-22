package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int areaR1;
		int areaR2;
		double per1;
		double per2;
		
		r1.setBase(6);
		r1.setAltura(8);
		areaR1 = r1.calcularArea();
		System.out.println("Area del r1 es: "+areaR1);
		per1 = r1.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per1);
		
		r2.setBase(7);
		r2.setAltura(8);
		areaR2 = r2.calcularArea();
		System.out.println("Area del r2 es: "+areaR2);
		per2 = r2.calcularPerimetro();
		System.out.println("Perimetro del r1 es:"+per2);
		
	}
}
