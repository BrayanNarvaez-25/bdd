package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String Nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.Nombre = nombre;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		if(nota >= 0 && nota < 8) {
			resultado = "F";
			System.out.println("El estudiante "+Nombre+" tiene una valoración de: "+resultado);
		}else if(nota >= 8 && nota <=10) {
			resultado = "A";
			System.out.println("El estudiante "+Nombre+" tiene una valoración de: "+resultado);
		}else {
			System.out.println("La nota de "+Nombre+" es incorrecta");
		}
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
