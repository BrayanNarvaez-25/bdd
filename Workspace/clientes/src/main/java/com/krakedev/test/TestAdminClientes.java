package com.krakedev.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.entidades.Clientes;
import com.krakedev.entidades.Compras;
import com.krakedev.servicios.AdminClientes;
import com.krakedev.utils.Convertidor;

public class TestAdminClientes {

	public static void main(String[] args) {
		Compras com = new Compras(1,"1727392035");
		Clientes cl = new Clientes("1727392035","Brayan","Narváez",com);
		
		try {
			cl.setNombre("Steven");
			cl.setApellido("Aguirre");
			AdminClientes.eliminar(cl.getCedula());
		} catch (Exception e) {
			System.out.println("Error en el sistema: " +e.getMessage());
		}
	}

}
