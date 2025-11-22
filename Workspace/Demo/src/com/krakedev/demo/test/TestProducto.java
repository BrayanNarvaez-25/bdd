package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(17,"Pan");
		producto1.setDescripcion("Es suave");
		producto1.setPeso(0.16);
		
		System.out.println("El codigo es: "+producto1.getCodigo());
		System.out.println("El nombre es: "+producto1.getNombre());
		System.out.println("Descripción: "+producto1.getDescripcion());
		System.out.println("El peso es: "+producto1.getPeso());
	}

}
