package RyanUI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DBController;

public class EventsDA {
	
    public static int createEvent(EventConsructor eventconstructor){
    	DBController db=new DBController();
    	String dbQuery;
    	PreparedStatement pstmt;
    	int id=-1;
    	
    	//step 1: establish connection to database
    	db.getConnection();
    	
    	//step 2: declare the SQL statement
    	dbQuery="INSERT INTO events(name, time, description, location, organiser) values (?,?,?,?,?)";
    	pstmt=db.getPreparedStatementWithKey(dbQuery);
    	
    	//step 3: to insert record
    	try {
    		pstmt.setString(1,EventConsructor.getName());
    		pstmt.setString(2, EventConsructor.getTime());
    		pstmt.setString(3,EventConsructor.getDescription());
    		pstmt.setString(4,EventConsructor.getLocation());
    		pstmt.setString(5, EventConsructor.getOrganiser());
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