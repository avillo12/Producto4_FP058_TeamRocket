package conectorHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectorconBBDD {
	public static void main(String[] args) {
		
		String connection="jdbc:mysql://localhost:3306/teamrocket?useSSL=false";
		String user = "root";
		String pw = "";
		
		try {
			System.out.println("intentando conectar "+connection);
			Connection myConnection = DriverManager.getConnection(connection, user, pw);
			System.out.println("Conexion realizada");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
