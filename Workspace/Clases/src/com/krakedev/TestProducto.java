package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Finalin";
		productoA.descripcion = "Para el dolor muscular";
		productoA.precio = 3.50;
		productoA.stockActual = 5;
		
		productoB.nombre = "Buprex";
		productoB.descripcion = "Jarabe para la toz";
		productoB.precio = 7.50;
		productoB.stockActual = 9;
		
		productoC.nombre = "Paracetamol";
		productoC.descripcion = "Para todo";
		productoC.precio = 0.50;
		productoC.stockActual = 100;
		
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion );
		System.out.println("Precio: " + productoA.precio );
		System.out.println("Stock: " + productoA.stockActual );
		
		System.out.println("******");
		
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion );
		System.out.println("Precio: " + productoB.precio );
		System.out.println("Stock: " + productoB.stockActual );
		
		System.out.println("******");
		
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion );
		System.out.println("Precio: " + productoC.precio );
		System.out.println("Stock: " + productoC.stockActual );
		
		
	}

}
