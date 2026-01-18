package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		Categoria c1 = new Categoria(1,"Snacks");
		Producto p1 = new Producto("A1","Doritos",c1,0.60,2);
		listaProductos.add(p1);
		
		Categoria c2 = new Categoria(2,"Viveres");
		Producto p2 = new Producto("A2","Azúcar",c2,1.00,5);
		listaProductos.add(p2);
		
		Categoria c3 = new Categoria(3,"Juguetes");
		Producto p3 = new Producto("A3","Cubo rubik",c3,2.50,3);
		listaProductos.add(p3);
		return listaProductos;
	}
}
