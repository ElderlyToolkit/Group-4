package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.Dictionary;
import Entity.MatchmakingConsructor;
import UI.Matchmaking;


public class MatchmakingDA {
	public static int createMatchmaking(MatchmakingConsructor constructor) throws ClassNotFoundException{
    	DBController db=new DBController();
    	String dbQuery;
    	PreparedStatement pstmt;
    	int id=-1;
    	
    	//step 1: establish connection to database
    	db.getConnection();
    	
    	//step 2: declare the SQL statement
    	dbQuery="INSERT INTO matchmaking(Name, Age, Gender, Email, Preference) values (?,?,?,?,?)";
    	pstmt=db.getPreparedStatementWithKey(dbQuery);
    	
    	//step 3: to insert record
    	try {
    		pstmt.setString(1,MatchmakingConsructor.getName());
    		pstmt.setString(2,MatchmakingConsructor.getAge());
    		pstmt.setInt(3,MatchmakingConsructor.getGender());
    		pstmt.setString(4, MatchmakingConsructor.getEmail());
    		pstmt.setInt(5, MatchmakingConsructor.getPreference());
    		pstmt.executeUpdate();
    		
    		// getting the auto generated key from the database
    		ResultSet rset=pstmt.getGeneratedKeys();
    		if (rset.next())
    			id=rset.getInt(1);
    		
    		pstmt.close();
    		
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	return id;    	
    }
	
	public static MatchmakingConsructor retrieveName(String name) {
		MatchmakingConsructor constructor;
		ResultSet rs = null;
		DBController db = new DBController();
		String databaseName = null, databaseAge = null, databaseEmail = null;
		int databaseGender = 0, databasePreference = 0;
		String dbQuery = "SELECT * FROM users WHERE name='" + name + "'";
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
				databaseName = rs.getString("name");
				databaseAge = rs.getString("age");
				databaseGender = rs.getInt("gender");
				databaseEmail = rs.getString("email");
				databasePreference = rs.getInt("preference");
			}
		} catch (SQLException z) {
			z.printStackTrace();
		}	
		
		constructor = new MatchmakingConsructor(databaseName, databaseAge, databaseGender, databaseEmail, databasePreference);
		return constructor;
	}
	
	public static ResultSet returnDetails(int preferedage, int preferedgender) {
		ResultSet rs = null;
		String dbQuery = null;
		DBController db=new DBController();
		
		if (preferedgender == 1 || preferedgender == 2){
			if (preferedage == 0) {
				dbQuery = "SELECT name, age, gender FROM users WHERE gender='" + preferedgender + "'";
			}
			else {
				dbQuery = "SELECT name, age, gender FROM users WHERE age='" + preferedage + "' AND gender='" + preferedgender + "'";
			}
		}
		else if (preferedgender == 0) {
			if (preferedage == 0) {
				dbQuery = "SELECT name, age, gender FROM users";
			}
			else {
				dbQuery = "SELECT name, age, gender FROM users WHERE age='" + preferedage + "'";
			}
		}
		
		return rs = db.readRequest(dbQuery);
	}
}
