package com.krakedev.conexionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion2 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Bn251107bN");
			System.out.println("Conexión exitosa");
			ps = connection.prepareStatement("insert into clientes(cedula,nombre,apellido)"
					+ "values(?,?,?)");
			
			ps.setString(1, "1727392035");
			ps.setString(2, "Brayan");
			ps.setString(3, "Narváez");
			ps.executeUpdate();
			System.out.println("Cliente creado");
			
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Bn251107bN");
			System.out.println("Conexión exitosa");
			ps = connection.prepareStatement("insert into compras(id_compra,cedula,fecha_compra,monto)\r\n"
					+ "values(?,?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "1727392035");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				//Crea un java.sql.date partiendo de un java.util.date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				ps.setDate(3, fechaSQL);
				ps.setBigDecimal(4, new BigDecimal(504.31) );
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
