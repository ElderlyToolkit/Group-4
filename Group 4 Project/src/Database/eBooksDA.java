package Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.eBooksConstructor;

public class eBooksDA {
	private static int steps = 1;
	
	public static String nextPage(eBooksConstructor ebc){
		
		steps++;
		String s = "";
		ResultSet rs = null;
		DBController DBC = new DBController();
		String dbQuery;
		PreparedStatement pstmt;
		DBC.getConnection();
		
		dbQuery="SELECT * FROM ebooks WHERE category='" + ebc + "' AND step='" + steps +"'";
		
		//queries database
		rs = DBC.readRequest(dbQuery);
		
		try{
			while(rs.next()){
				s = rs.getString("content");
			}
			
		}catch(SQLException f){
			f.printStackTrace();
		}
		return s;
	}

}
