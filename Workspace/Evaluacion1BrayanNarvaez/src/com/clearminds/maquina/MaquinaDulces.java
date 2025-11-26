package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		Celda codigo;
		for (int i = 0; i < celdas.size(); i++) {
			codigo = celdas.get(i);
			System.out.println("Código: " + codigo.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
				break;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda codigo;
		for (int i = 0; i < celdas.size(); i++) {
			codigo = celdas.get(i);
			if (codigo.getCodigo() != null) {
				Producto codigoAx = new Producto("", "", 0.0);
				codigoAx = codigo.getProducto();
				if (codigo.getProducto() == null) {
					System.out.println("Código: " + codigo.getCodigo() + " " + "Stock: " + codigo.getStock() + " "
							+ "Sin Producto Asignado");
				} else {

					System.out.println("Código: " + codigo.getCodigo() + " " + "Stock: " + codigo.getStock() + " "
							+ "Producto: " + codigoAx.getCodigo() + " " + "Precio: " + codigoAx.getPrecio());
				}

			}
		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda elementoCelda;
		Producto productoEncontrado = null;
		Producto elementoProducto = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			elementoProducto = elementoCelda.getProducto();
			if (elementoProducto != null) {
				if (elementoCelda.getCodigo() == codigo) {
					productoEncontrado = elementoProducto;
					return productoEncontrado;
				}
			}
		}

		return productoEncontrado;
	}

	public double consultarPrecio(String codigo) {
		Celda codigo1;
		double precio = 0.0;
		for (int i = 0; i < celdas.size(); i++) {
			codigo1 = celdas.get(i);
			if (codigo1.getCodigo() != null) {
				Producto codigoAx = new Producto("", "", 0.0);
				codigoAx = codigo1.getProducto();
				if (codigo1.getProducto() != null) {
					return codigo1.getProducto().getPrecio();
				}
			}
		}
		return precio;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda codigo2;
		Producto producto;
		for (int i = 0; i < celdas.size(); i++) {
			codigo2 = celdas.get(i);
			producto = codigo2.getProducto();
			if (producto != null) {
				if (producto.getCodigo() == codigo) {
					return codigo2;
				}
			}
		}
		return null;
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
	}

	public void mostrarProductosNuevo() {
		for (Celda celda : celdas) {
			String codigoCelda = celda.getCodigo();
			int stock = celda.getStock();
			Producto producto = celda.getProducto();
			if (producto == null) {
				System.out.println("Celda: " + codigoCelda + " Stock: " + stock + " Sin Producto asignado");
			} else {
				String nombreProducto = producto.getNombre();
				double precio = producto.getPrecio();

				System.out.println("Celda: " + codigoCelda + " Stock: " + stock + " Producto: " + nombreProducto
						+ " Precio: " + precio);
			}
		}
		System.out.println("\nSaldo: " + saldo);
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

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<>();
		for (Celda celda : celdas) {
			Producto producto = celda.getProducto();
			if (producto != null) {
				if (producto.getPrecio() <= limite) {
					productosMenores.add(producto);
				}
			}
		}
		return productosMenores;
	}

	public void imprimirProductosMenores(double limite) {
		ArrayList<Producto> listaEncontrada = buscarMenores(limite);
		System.out.println("Productos Menores: " + listaEncontrada.size());
		for (Producto producto : listaEncontrada) {
			String nombre = producto.getNombre();
			double precio = producto.getPrecio();
			System.out.println("Nombre:" + nombre + " Precio:" + precio);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
