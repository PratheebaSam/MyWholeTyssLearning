package com.tyss.jdbsconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String[] args)  {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/prathi","root","Onebill@2020");
			System.out.println("connection created");
			Statement createStatement = connection.createStatement();
			boolean execute = createStatement.execute("create table test(id int)");
			System.out.println(execute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
