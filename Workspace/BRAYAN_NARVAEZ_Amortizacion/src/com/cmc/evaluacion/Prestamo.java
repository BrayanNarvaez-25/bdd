package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;
	private String cedulaCliente;
	
	public void mostrarPrestamo() {
        System.out.println("[monto= "+this.monto +", interes="+this.interes+", palzo="+this.plazo+"]");
    }
	
	public Prestamo(double monto, double interes, int plazo, String cedulaCliente) { 
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.cedulaCliente = cedulaCliente; // <--- ASIGNAR CÉDULA
        this.cuotas = new ArrayList<>(); 
    }
	
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new ArrayList<>();
	}
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}
	
	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	
	
}
