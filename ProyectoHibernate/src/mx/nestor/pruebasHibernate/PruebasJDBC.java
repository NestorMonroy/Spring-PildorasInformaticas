package mx.nestor.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		String usuario="root";
		String contra="Rojo2022*";
				
		
		try {
			System.out.println("Intentando conectar ");
			
			Connection miConexion=DriverManager.getConnection(jdbcUrl,usuario,contra);
			
			System.out.println("Conexion exitosa!!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

}
