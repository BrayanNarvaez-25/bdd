package com.krakedev.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.conexionbdd.ConexionBDD;
import com.krakedev.entidades.Clientes;

public class AdminClientes {
	private static final Logger LOGGER = LogManager.getLogger(AdminClientes.class);

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cedula a eliminar: "+ cedula);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from clientes where cedula = ?");
			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al Eliminar", e);
			throw new Exception("Error al Eliminar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a Actualizar>>>> " + cliente);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update clientes set nombre = ?, apellido = ? where cedula=?");
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellido());
			ps.setString(3, cliente.getCedula());

			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void insertar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cliente a insertar>>>> " + cliente);
		try {
			// Abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into clientes(cedula,nombre,apellido)"
							+ "			values(?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellido());

			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static ArrayList<Clientes> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Select * from clientes where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				
				Clientes p = new Clientes();
				p.setCedula(cedula);
				p.setNombre(nombre);
				clientes.add(p);
			}
		} catch (Exception e) {
			LOGGER.error("Error al Consultar por nombre", e);
			throw new Exception("Error al Consultar por nombre");
		}finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return clientes;
	}
	
	public static Clientes buscarPorCedula(String cedula) throws Exception{
		Clientes cliente = new Clientes();
		cliente = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Select * from clientes where cedula = ? ");
			ps.setString(1, cedula);
			
			rs = ps.executeQuery();
			
			if(rs.next() == true) {
				String cedulaN = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				cliente = new Clientes(cedulaN,nombre,apellido);
				return cliente;
			}else {
				return cliente;
			}
		} catch (Exception e) {
			LOGGER.error("Error al Consultar por nombre", e);
			throw new Exception("Error al Consultar por nombre");
		}finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
}
