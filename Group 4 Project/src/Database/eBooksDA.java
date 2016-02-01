package Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.eBooksConstructor;

public class eBooksDA {
	private static int steps = 1;
	
	public static eBooksConstructor nextPage (String catergory) {
		steps++;
		String content = "";
		ResultSet rs = null;
		DBController DBC = new DBController();
		String dbQuery;
		PreparedStatement pstmt;
		DBC.getConnection();
		
		dbQuery="SELECT * FROM ebooks WHERE category='" + catergory + "' AND step='" + steps +"'";
		
		//queries database
		rs = DBC.readRequest(dbQuery);
		
		try{
			while(rs.next()){
				content = rs.getString("content");
			}
			
		}catch(SQLException f){
			f.printStackTrace();
		}
		eBooksConstructor constructor = new eBooksConstructor(catergory, content);
		
		
		return constructor;
	}
	
	public static eBooksConstructor prevPage (String catergory) {
		steps--;
		String content = "";
		ResultSet rs = null;
		DBController DBC = new DBController();
		String dbQuery;
		PreparedStatement pstmt;
		DBC.getConnection();
		
		dbQuery="SELECT * FROM ebooks WHERE category='" + catergory + "' AND step='" + steps +"'";
		
		//queries database
		rs = DBC.readRequest(dbQuery);
		
		try{
			while(rs.next()){
				content = rs.getString("content");
			}
			
		}catch(SQLException f){
			f.printStackTrace();
		}
		eBooksConstructor constructor = new eBooksConstructor(catergory, content);
		
		
		return constructor;
	}
}
