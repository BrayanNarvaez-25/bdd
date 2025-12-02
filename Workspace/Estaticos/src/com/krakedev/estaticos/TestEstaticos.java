package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		//Para invocar a un método estatico se lo hace directamente
		//desde la clase, NO hace falta instanciar un objeto
		double num = Math.random();
		System.out.println(num);
		
		int radio = 10;
		double area = Math.PI * radio;
		System.out.println(area);
	}

}
