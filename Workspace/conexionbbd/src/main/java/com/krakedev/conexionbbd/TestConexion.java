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

public class TestConexion {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Bn251107bN");
			System.out.println("Conexión exitosa");
			ps = connection.prepareStatement("insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
					+ "			values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1922939482");
			ps.setString(2, "Sean");
			ps.setString(3, "Suárez");
			ps.setDouble(4, 1.70);
			ps.setBigDecimal(7, new BigDecimal(1200.45));
			ps.setInt(8, 5);
			
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
				
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
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
