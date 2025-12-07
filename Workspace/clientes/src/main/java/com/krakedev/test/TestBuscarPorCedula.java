package com.krakedev.test;

import com.krakedev.entidades.Clientes;
import com.krakedev.servicios.AdminClientes;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		try {
			Clientes cliente = AdminClientes.buscarPorCedula("1281728318");
			System.out.println(cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
