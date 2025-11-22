package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("Ferrari");
		auto1.setAnio(212);
		auto1.setPrecio(2121.32);

		auto2.setMarca("Mclaren");
		auto2.setAnio(2323);
		auto2.setPrecio(1321.321);;
		
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("******");
		
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());

	}

}
