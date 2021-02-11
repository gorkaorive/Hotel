package aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public final static int GESTIONAR_USUARIOS_HOTEL = 1;
	public final static int GESTIONAR_HOTELES_Y_HABITACIONES = 2;
	public final static int RESERVAS_DEL_HOTEL = 3;
	
public static void main(String[] args) {
	
//1. Gestionar clientes

	try {
		
		//se carga el driver
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//crear la conexion con la BBDD biblioteca
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
		
		//statement para ejecutar querys
		Statement st = con.createStatement();
		
		//ejecutar query
		ResultSet rs = st.executeQuery("select * from clientes");
		
		//imprimir en pantalla el resultado de la consulta
		while(rs.next()) {
			
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("cif"));
			System.out.println(rs.getString("nombre"));
			System.out.println(rs.getString("gerente"));
			System.out.println(rs.getInt("estrellas"));
			System.out.println(rs.getString("compania"));
		}
		
		//ejecutar un insert
		st.execute("INSERT INTO usuarios(id, cif, nombre, gerente, estrellas, compania) VALUES ('3', 'test', 'Gorka', 'Gorka2', '2', 'HD')");
		
	
		
			
			
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	
	}
}

}

//2. Gestionar hoteles y habitaciones del hotel 
	
//3. Reservas del hotel
	



      