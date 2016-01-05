package RyanUI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DBController;

public class EventsDA {
	
    public static int createItem(EventConsructor eventconstructor){
    	DBController db=new DBController();
    	String dbQuery;
    	PreparedStatement pstmt;
    	int id=-1;
    	
    	//step 1: establish connection to database
    	db.getConnection();
    	
    	//step 2: declare the SQL statement
    	dbQuery="INSERT INTO item(name, description, price, image) values (?,?,?,?)";
    	pstmt=db.getPreparedStatementWithKey(dbQuery);
    	
    	//step 3: to insert record
    	try {
    		pstmt.setString(1,item.getname());
    		pstmt.setString(2,item.getdescription());
    		pstmt.setDouble(3,item.getprice());
    		pstmt.setBytes(4, item.getimage());
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