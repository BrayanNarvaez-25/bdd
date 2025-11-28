package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	
	private ArrayList<Contacto> contacto;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;
  
	public void depurar() {
	    for (Contacto contacto : this.contacto) {
	        
	        // La condición para ser 'correcto' es tener la dirección asignada (no ser null)
	        if (contacto.getDireccion() != null) {
	            this.correctos.add(contacto); // Contacto con dirección (Correcto)
	        } else {
	            this.incorrectos.add(contacto); // Contacto sin dirección (Incorrecto)
	        }
	    }
	    
	    // Luego de repartirlos, vaciar la lista de contactos
	    this.contacto.clear();
	}
	
	public int contarFijos() {
	    int contadorFijos = 0;
	    for (Contacto contacto : this.contacto) {
	        if (contacto.getTelefono() != null) {
	            boolean tieneFijoValido = false; 
	            for (Telefono tel : contacto.getTelefono()) {
	                boolean esConvencional = "Convencional".equals(tel.getTipo());
	                boolean esCorrecto = "C".equals(tel.getEstado());
	                
	                if (esConvencional && esCorrecto) {
	                    tieneFijoValido = true;
	                    break; 
	                }
	            }
	            if (tieneFijoValido) {
	                contadorFijos++;
	            }
	        }
	    }
	    
	    return contadorFijos;
	}
	
	public int contarPerdidos() {
	    int contadorPerdidos = 0; 
	    for (Contacto contacto : this.contacto) {

	        if (contacto.getDireccion() == null) {
	            contadorPerdidos++; 
	        }
	    }
	    return contadorPerdidos;
	}
	
	public String consultarUltimaModificacion() {
       Date fechaActual = new Date();
       SimpleDateFormat fecha = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
   
       String fechaNueva = fecha.format(fechaActual);
     
       return fechaNueva;
	}
	
	public Directorio(Contacto contactoInicial) {
	    this.contacto = new ArrayList<Contacto>(); 
	    this.fechaModificacion = new Date();     
	    String cedulaNueva = contactoInicial.getCedula();
	    Contacto contactoExistente = buscarPorCedula(cedulaNueva);
	    if (contactoExistente == null) {
	        this.contacto.add(contactoInicial);
	    }
	}
	
	public Directorio() {
		this.contacto = new ArrayList<Contacto>();
		this.correctos = new ArrayList<Contacto>();
        this.incorrectos = new ArrayList<Contacto>();
	}

	public Contacto buscarPorCedula(String cedula) {
	    for (Contacto contacto : this.contacto) {
	        String cedulaContacto = contacto.getCedula();     
	        if (cedula.equals(cedulaContacto)) {
	            return contacto;
	        }
	    }
	    return null;
	}
	
	public boolean agregarContacto(Contacto contacto) {
	  
	    this.contacto.add(contacto);
	    return true;
	}
	
	public ArrayList<Contacto> getContacto() {
		return contacto;
	}
	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	
}
