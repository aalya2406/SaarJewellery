/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private Connection conn = null;
    private Statement statement = null;

    public Connection openConnection() throws SQLException {
	if (conn == null) {
	    String url = "jdbc:mysql://localhost/";
	    String dbName = "saardb";
	    String driver = "com.mysql.cj.jdbc.Driver";
	    String userName = "root";
	    String password = "";
	    try {
		Class.forName(driver);
		this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
		System.out.println("Connection Successful");
	    } catch (ClassNotFoundException | SQLException sqle) {
		//sqle.printStackTrace();
		System.out.println("Connection Fail");
	    }
	}
	return conn;
    }
}
