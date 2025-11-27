package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> nota;
	
	public void agregarNota(Nota notaNueva) {
		double valor = notaNueva.getCalificacion();
		if (valor <= 0 || valor > 10) {
			System.out.println("La nota debe ser mayor que 0 y menor o igual a 10.");
			return;
		}
		Materia codigoNuevo = notaNueva.getMateria();
		boolean codigoRepetido = false;

		for (int i = 0; i < nota.size(); i++) {
			Nota notaExistente = nota.get(i);
			Materia codigoExistente = notaExistente.getMateria();
			if (codigoExistente.getCodigo().equals(codigoNuevo)) {
				codigoRepetido = true;
				break;
			}
		}

		if (codigoRepetido) {
			System.out.println(" Ya existe una nota con el código de materia '" + codigoNuevo);
		} else {
			nota.add(notaNueva);
			System.out.println("Nota con código '" + codigoNuevo.getCodigo() + "' agregada correctamente.");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		if (nuevaNota < 0 || nuevaNota > 10) {
			System.out.println("La nueva nota (" + nuevaNota + ") debe estar entre 0 y 10");
			return;
		}
		boolean encontrado = false;
		for (int i = 0; i < nota.size(); i++) {
			Nota notaEncontrada = nota.get(i);
			Materia materiaEncontrada = notaEncontrada.getMateria();
			if (materiaEncontrada.getCodigo().equals(codigo)) {
				notaEncontrada.setCalificacion(nuevaNota);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró ninguna materia con el código '" + codigo);
		}
	}

	public double calcularPromedioNotasEstudiante() {
		int totalMaterias = nota.size();
		double sumaTotalNotas = 0.0;

		for (Nota nota : nota) {
			sumaTotalNotas += nota.getCalificacion();
		}
		double promedio = sumaTotalNotas / totalMaterias;

		return promedio;
	}
	
	public void mostrar() {
		Nota cadena;
		System.out.println("Nombre: "+nombre + " Apellido: "+apellido+" Cédula: "+ cedula);
		for(int i = 0;i < nota.size();i++) {
			cadena = nota.get(i);
			System.out.println("Notas: "+cadena.getCalificacion());
		}
	}

	public Estudiante(String cedula , String nombre , String apellido ) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.cedula = cedula;
	    this.nota = new ArrayList<Nota>(); 
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}
}
