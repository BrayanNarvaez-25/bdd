package com.cmc.directorio.entidades;

public class AdminContacto {
	
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso() > c2.getPeso()) {
			return c1;
		}else if(c2.getPeso() > c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	
	public boolean compararOperadoras(Telefono t1,Telefono t2) {
		if(t1.getOperadora() == t2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean activarUsuario(Telefono t, Contacto c) {
		if(t.getTieneWhatsapp() == true) {
			c.setActivo(true);
			return true;
		}else {
			return false;
		}
		
	}
}