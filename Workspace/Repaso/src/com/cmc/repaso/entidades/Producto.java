package com.cmc.repaso.entidades;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecioRomo(int descuento) {
		double precioPositivo = setPrecio(precio);
		double montoDescuento = (precioPositivo * descuento)/100;
		double precioFinal = precioPositivo - montoDescuento;
		System.out.println("El precio final es: "+precioFinal);
		return precioFinal;
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
	public double setPrecio(double precio) {
		this.precio = precio;
		if(precio < 0) {
			precio = precio * -1;
			return precio;
		}
		return precio;
	}
	
	
}
