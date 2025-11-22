package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Ferrari",212,2121.32);
		Auto auto2 = new Auto("Mclaren",2323,1321.321);
		Auto auto3 = new Auto("Nissan",2024,2332.43);
		
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("******");
		
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());

		System.out.println("******");
		
		System.out.println("Marca: " + auto3.getMarca());
		System.out.println("Año: " + auto3.getAnio());
		System.out.println("Precio: " + auto3.getPrecio());

	}

}
