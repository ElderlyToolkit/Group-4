package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ForumsDA {
	public static int createForum(ForumsConstructor constructor){
		DBController DBC = new DBController();
		String dbQuery;
		PreparedStatement pstmt;
		int id = -1;
		
		DBC.getConnection();
		
		dbQuery="INSERT INTO forum(message, category, subject) values (?,?,?)";
		pstmt=DBC.getPreparedStatementWithKey(dbQuery);
		
		try {
    		pstmt.setString(1,ForumsConstructor.getMessage());
    		pstmt.setString(2,ForumsConstructor.getCategory());
    		pstmt.setString(3, ForumsConstructor.getSubject());
    		
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
