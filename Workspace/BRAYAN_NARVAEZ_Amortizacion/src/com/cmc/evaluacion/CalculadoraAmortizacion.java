package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double m = prestamo.getMonto();
		double i = prestamo.getInteres() / 100.00 / 12.00;
		int p = prestamo.getPlazo();

		double cuota = (m * i) / (1 - Math.pow(1 + i, -p));
		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuotaFija = Utilitario.redondear(calcularCuota(prestamo));
		double interesMensual = prestamo.getInteres() / 100.0 / 12.0;
		int plazo = prestamo.getPlazo();
		ArrayList<Cuota> cuotas = prestamo.getCuotas();

		cuotas.clear();
		for (int i = 0; i < plazo; i++) {
			Cuota nuevaCuota = new Cuota(i + 1); 
			nuevaCuota.setCuota(cuotaFija); 
			cuotas.add(nuevaCuota);
		}

		cuotas.get(0).setCapitalInicio(prestamo.getMonto());
		for (int i = 0; i < plazo; i++) {
			Cuota cuotaActual = cuotas.get(i);
			Cuota siguienteCuota = (i < plazo - 1) ? cuotas.get(i + 1) : null;

			calcularValoresCuota(cuotaActual, interesMensual, siguienteCuota);
		}

		Cuota ultimaCuota = cuotas.get(plazo - 1);
		double saldoPendiente = ultimaCuota.getSaldo(); 
		if (saldoPendiente != 0.0) {
			double nuevoAbonoCapital = ultimaCuota.getAbonoCapital() + saldoPendiente;
			ultimaCuota.setAbonoCapital(Utilitario.redondear(nuevoAbonoCapital));
			ultimaCuota.setSaldo(0.0);
		}
	}

	public static void calcularValoresCuota(Cuota cuotaActual, double interesMensual, Cuota siguienteCuota) {
		double interesCalculado = cuotaActual.getCapitalInicio() * interesMensual;
		double interesRedondeado = Utilitario.redondear(interesCalculado);
		cuotaActual.setInteres(interesRedondeado);

		double abonoCapitalCalculado = cuotaActual.getCuota() - interesRedondeado;
		double abonoCapitalRedondeado = Utilitario.redondear(abonoCapitalCalculado);
		cuotaActual.setAbonoCapital(abonoCapitalRedondeado);

		double saldoFinalCalculado = cuotaActual.getCapitalInicio() - abonoCapitalRedondeado;
		double saldoFinalRedondeado = Utilitario.redondear(saldoFinalCalculado);
		cuotaActual.setSaldo(saldoFinalRedondeado);
		if (siguienteCuota != null) {
			siguienteCuota.setCapitalInicio(saldoFinalRedondeado);
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {

		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		System.out.println("No. | Cuota | C.Inicio | Interes | Ab.Capital | Saldo");
		System.out.println("---------------------------------------------------------------");
		for (Cuota c : cuotas) {
			c.mostrarPrestamo();
		}
	}
}
