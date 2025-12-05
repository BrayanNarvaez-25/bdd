package com.krakedev.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Compras {
	private int id_compra;
	private String cedula;
	private Date fecha_compra;
	private BigDecimal monto;
	
	
	@Override
	public String toString() {
		return "Compras [id_compra=" + id_compra + ", cedula=" + cedula + ", fecha_compra=" + fecha_compra + ", monto="
				+ monto + "]";
	}

	public Compras() {}
	
	public Compras(int id_compra, String cedula, Date fecha_compra) {
		super();
		this.id_compra = id_compra;
		this.cedula = cedula;
		this.fecha_compra = fecha_compra;
	}



	public Compras(int id_compra, String cedula) {
		super();
		this.id_compra = id_compra;
		this.cedula = cedula;
	}

	public Compras(int id_compra, String cedula, Date fecha_compra, BigDecimal monto) {
		super();
		this.id_compra = id_compra;
		this.cedula = cedula;
		this.fecha_compra = fecha_compra;
		this.monto = monto;
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
}
