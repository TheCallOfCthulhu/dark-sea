package JDBC.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "Krepelek3");
			
			Statement statement = conn.createStatement();
	//	ResultSet resultSet = statement.executeQuery("select * from employees_tbl"); //vypis z DV
			
			
			//zapis do DB
			statement.executeUpdate("insert into employees_tbl (id,name,dept,salary) "
					+ "values (900,'Jarek','Sales',6666);");
			
			
			//vypis z DB
//			while (resultSet.next()) { 
//				System.out.println(resultSet.getString("name"));
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
