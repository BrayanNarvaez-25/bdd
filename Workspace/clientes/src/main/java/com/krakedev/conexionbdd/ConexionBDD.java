package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO = "postgres";
	private final static String CONTRASENA = "Bn251107bN";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		//Abrir conexion
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
			LOGGER.debug("Conexión exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse,revise usuario y clave",e);
			throw new Exception("Error al conectarse,revise usuario y clave");
		} 
		return connection;
	}
}
