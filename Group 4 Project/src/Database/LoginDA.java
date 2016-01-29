package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.LoginConstructor;

public class LoginDA {
	public static LoginConstructor authenticateUser(String name, String password) {
		String databaseUsername = null;
		String databasePassword = null;
		String databasePermission = null;
		ResultSet rs = null;
		
		DBController db=new DBController();
		
		String dbQuery = "SELECT name, password, permissions FROM users WHERE name='" + name + "' AND password='" + password+ "'";
		
		//queries database
		rs = db.readRequest(dbQuery);
		
		//check username and password
		try {
			while (rs.next()) {
			    databaseUsername = rs.getString("name");
			    databasePassword = rs.getString("password");
			    databasePermission = rs.getString("permissions");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		LoginConstructor login = new LoginConstructor(databaseUsername, databasePassword, databasePermission);
		return login;
	}
}
