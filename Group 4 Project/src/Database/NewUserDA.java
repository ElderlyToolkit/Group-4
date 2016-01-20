package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NewUserDA {
	
    public static int createUser(NewUserConstructor constructor){
    	DBController db=new DBController();
    	String dbQuery;
    	PreparedStatement pstmt;
    	int id=-1;
    	
    	//step 1: establish connection to database
    	db.getConnection();
    	
    	//step 2: declare the SQL statement
    	dbQuery="INSERT INTO users(name, age, gender, email, password, permissions, photo) values (?,?,?,?,?,?,?)";
    	pstmt=db.getPreparedStatementWithKey(dbQuery);
    	
    	//step 3: to insert record
    	try {
    		pstmt.setString(1,NewUserConstructor.getName());
    		pstmt.setInt(2,NewUserConstructor.getAge());
    		pstmt.setInt(3,NewUserConstructor.getGender());
    		pstmt.setString(4, NewUserConstructor.getEmail());
    		pstmt.setString(5, NewUserConstructor.getPassword());
    		pstmt.setString(6, NewUserConstructor.getPermission());
    		pstmt.setString(7, NewUserConstructor.getPhoto());
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