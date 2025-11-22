package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Finalin");;
		productoA.setDescripcion("Para el dolor muscular");;
		productoA.setPrecio(3.50);
		productoA.setStockActual(5);
		
		productoB.setNombre("Buprex");;
		productoB.setDescripcion("");
		productoB.setPrecio(2.4);
		productoB.setStockActual(6);
		
		productoC.setNombre("Paracetamol");
		productoC.setDescripcion("");
		productoC.setPrecio(3.60);
		productoC.setStockActual(7);
		
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion() );
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());
		
		System.out.println("******");
		
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion() );
		System.out.println("Precio: " + productoB.getPrecio() );
		System.out.println("Stock: " + productoB.getStockActual());
		
		System.out.println("******");
		
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion() );
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());
		
		
	}

}
