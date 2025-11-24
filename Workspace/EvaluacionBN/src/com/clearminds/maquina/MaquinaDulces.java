package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		this.celda1 = new Celda(c1);
		this.celda2 = new Celda(c2);
		this.celda3 = new Celda(c3);
		this.celda4 = new Celda(c4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (this.celda1.getCodigo() == codigo) {
			return celda1;
		} else if (this.celda2.getCodigo() == codigo) {
			return celda2;
		} else if (this.celda3.getCodigo() == codigo) {
			return celda3;
		} else if (this.celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		System.out.println("*******************CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Saldo: " + saldo);
	}
	
	public void mostrarProductosConSaldo() {
		System.out.println("*******************CELDA " + celda1.getCodigo());
		System.out.println("Saldo: " + saldo);
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda2.getCodigo());
		System.out.println("Saldo: " + saldo);
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda3.getCodigo());
		System.out.println("Saldo: " + saldo);
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("*******************CELDA " + celda4.getCodigo());
		System.out.println("Saldo: " + saldo);
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		if (celdaEncontrada != null) {
			Producto producto = celdaEncontrada.getProducto();
			if (producto != null) {
				return producto.getPrecio();
			}
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigo, int incrementar) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigo);

		if (celdaEncontrada != null) {

			if (incrementar > 0) {
				int stock = celdaEncontrada.getStock();
				int stockFinal = stock + incrementar;
				celdaEncontrada.setStock(stockFinal);
			} else {
				System.out.println("La cantidad a incrementar debe ser mayor que cero.");
			}
		} 
	}

	

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int stock = celdaEncontrada.getStock();
		int stockFinal = stock - 1;
		celdaEncontrada.setStock(stockFinal);
		double precioEncontrado = celdaEncontrada.getProducto().getPrecio();
		saldo = saldo + precioEncontrado;
		mostrarProductos();
	}

	public double venderConCambio(String codigo, int valorIngresado) {
        Celda celdaEncontrada = this.buscarCelda(codigo);
        
        double precioProducto = 0.0;
        double cambio = 0.0;

        if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
            
            precioProducto = celdaEncontrada.getProducto().getPrecio();
            
            if (valorIngresado >= precioProducto) {
                
            	int stock = celdaEncontrada.getStock();
        		int stockFinal = stock - 1;
        		celdaEncontrada.setStock(stockFinal);
                
                cambio = valorIngresado - precioProducto;
                
                this.saldo += precioProducto; 
                return cambio;
                
            } else {
                return valorIngresado; 
            }
        } else {
            
            return valorIngresado; 
        }
	
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
