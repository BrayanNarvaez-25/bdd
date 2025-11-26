package com.clearminds.componentes;

public class Producto {
	
	private String nombre;
	private double precio;
	private String codigo;
	
	public void incrementarPrecio(int porcentaje) {
		double incremento = porcentaje/100.0;
		double monto = precio * incremento;
		precio = precio + monto;
	}
	
	public void disminuirPrecio(double porcentaje) {
		precio = precio - 0.35;
	}
	
	
	public Producto(String codigo ,String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
