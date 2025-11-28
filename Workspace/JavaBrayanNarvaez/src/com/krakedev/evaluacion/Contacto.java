package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String tipo;
	private Direccion direccion;
	private ArrayList<Telefono>telefono;
	
	public ArrayList<Telefono> recuperarIncorrectos() {
	    ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
	    for (Telefono tel : this.telefono) {
	        if ("E".equals(tel.getEstado())) {
	            telefonosIncorrectos.add(tel);
	        }
	    }
	    return telefonosIncorrectos;
	}
	
	public void agregarTelefono(Telefono telefonoNuevo) {
		this.telefono.add(telefonoNuevo);
	}
	
	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C':");
		
		for (Telefono tel : this.telefono) {
			if ("C".equals(tel.getEstado())) {
				System.out.println("Número: " + tel.getNumero() + ", Tipo: " + tel.getTipo());
			}
		}
	}
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = new ArrayList<Telefono>();
	}

	public void imprimir() {
		System.out.println("Información del Contacto:");
		System.out.println("Cédula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        if (this.direccion != null) {
            this.direccion.imprimirDireccion();
        } else {
            System.out.println("Dirección: No asignada");
        }
    }
	
	public void imprimirNuevo() {
		System.out.println("***" + this.nombre + " "+this.apellido+"***");
        if (this.direccion != null) {
            this.direccion.imprimirDireccionNuevo();
        } else {
            System.out.println("No tiene asociada una dirección");
        }
    }
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}
	
	
}
