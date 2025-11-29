package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		this.prestamos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public Banco(ArrayList<Prestamo> prestamos, ArrayList<Cliente> clientes) {
		this.prestamos = prestamos;
		this.clientes = clientes;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : this.clientes) {
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente nuevoCliente) {
		Cliente clienteExistente = buscarCliente(nuevoCliente.getCedula());

		if (clienteExistente == null) {
			this.clientes.add(nuevoCliente);
			System.out.println("Cliente " + nuevoCliente.getNombre() + " registrado exitosamente.");
		} else {
			System.out.println("El cliente con cédula " + nuevoCliente.getCedula() + " ya existe.");
		}
	}

	public void asignarPrestamo(String cedula, Prestamo nuevoPrestamo) {
		Cliente clienteExistente = buscarCliente(cedula);

		if (clienteExistente == null) {
		} else {
			
			nuevoPrestamo.setCedulaCliente(cedula); 

	
			CalculadoraAmortizacion.generarTabla(nuevoPrestamo);
			this.prestamos.add(nuevoPrestamo);
			// ...
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamosDelCliente = new ArrayList<>();
		for (Prestamo prestamo : this.prestamos) {
			String cedulaPrestamo = prestamo.getCedulaCliente();
			if (cedulaPrestamo != null && cedulaPrestamo.equals(cedula)) {
				prestamosDelCliente.add(prestamo);
			}
		}

		if (prestamosDelCliente.size() == 0) {
			return null;
		} else {
			return prestamosDelCliente;
		}
	}
}
