package com.krakedev.evaluacion;

public class Direccion {

	private String callePrincipal;
	private String calleSecundaria;

	public void imprimirDireccion() {
        System.out.println("Dirección:");
        System.out.println("  Calle Principal: " + callePrincipal);
        System.out.println("  Calle Secundaria: " + calleSecundaria);
    }
	
	public void imprimirDireccionNuevo() {
        System.out.println("Dirección: "+callePrincipal + " y "+calleSecundaria);
    }
	
	public Direccion(String callePrincipal, String calleSecundaria) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	
}
