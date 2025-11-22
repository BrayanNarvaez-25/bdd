package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item("Pan");
		Item item2 = new Item("Leche");
		
		item1.setProductosActuales(20);
		item2.setProductosActuales(20);
		
		item1.imprimir();
		item2.imprimir();
		
		item1.vender(5);
		item1.devolver(4);
		item1.imprimir();
		
		item2.vender(10);
		item2.devolver(6);
		item2.imprimir();
	}

}
