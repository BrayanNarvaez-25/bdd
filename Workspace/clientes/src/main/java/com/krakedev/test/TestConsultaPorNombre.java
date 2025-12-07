package com.krakedev.test;

import java.util.ArrayList;

import com.krakedev.entidades.Clientes;
import com.krakedev.servicios.AdminClientes;

public class TestConsultaPorNombre {
	public static void main(String[] args) {
		try {
			ArrayList<Clientes> clientes = AdminClientes.buscarPorNombre("a");
			System.out.println(clientes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
