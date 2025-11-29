package com.cmc.evaluacion;

public class Cuota {

	private int numero;
	private double cuota;
	private double capitalInicio;
	private double interes;
	private double abonoCapital;
	private double saldo;

	public void mostrarPrestamo() {
		float cuotaRen = (float) Utilitario.redondear(cuota);
		float capitalInicioRen = (float) Utilitario.redondear(capitalInicio);
		float interesRen = (float) Utilitario.redondear(interes);
		float abonoCapitalRen = (float) Utilitario.redondear(abonoCapital);
		float saldoRen = (float) Utilitario.redondear(saldo);
		
		System.out.println(numero + " | " + cuotaRen + " | " + capitalInicioRen + " | " + interesRen + " | " + abonoCapitalRen
				+ " | " + saldoRen);
	}

	public Cuota(int numero) {
		this.numero = numero;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getCapitalInicio() {
		return capitalInicio;
	}

	public void setCapitalInicio(double capitalInicio) {
		this.capitalInicio = capitalInicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
