package RyanUIPrototype;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DBController;


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
}
