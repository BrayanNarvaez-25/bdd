package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(0);
		//NPE Unchecked
	}

	public void metodo2() {
		File f = new File("Archivo1.txt");
		try {
			f.createNewFile(); //IOExcepcion - CHECKED
		}catch(IOException io) {
			System.out.println("Error");
		}
		
	}
	
	public void metodo3() throws IOException{
		File f = new File("Archivo1.txt");
		f.createNewFile(); //IOExcepcion - CHECKED
	}
	
	public void metodo4() {
		metodo3();
	}
}
