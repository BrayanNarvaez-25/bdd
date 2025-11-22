package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Pan",10.50);
		Producto producto2 = new Producto("Pan",-15.50);
		
		producto1.calcularPrecioRomo(5);
		producto2.calcularPrecioRomo(5);
	}

}
