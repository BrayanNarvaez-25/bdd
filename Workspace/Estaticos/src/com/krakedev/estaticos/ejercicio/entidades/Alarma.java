package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {

	private int dia;
	private int hora;
	private int minuto;
	
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
        // 1. Invocar el método estático formatearDia para el día.
        String diaFormateado = Util.formatearDia(this.dia);
        
        // 2. Invocar el método estático formatearHora para la hora.
        // (Nota: formatearHora sirve también para los minutos, ya que añade "0" si es < 10)
        String horaFormateada = Util.formatearHora(this.hora);
        
        // 3. Invocar el método estático formatearHora para los minutos.
        String minutoFormateado = Util.formatearHora(this.minuto);
        
        // 4. Retornar el String con el formato deseado (por ejemplo: DÍA HH:MM)
		return diaFormateado + ", " + horaFormateada + ":" + minutoFormateado;
	}
	
	
}
