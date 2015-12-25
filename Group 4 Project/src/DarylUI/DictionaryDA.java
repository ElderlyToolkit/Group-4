package DarylUI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DBController;


public class DictionaryDA {
	public static String retrieveMeaning(String term,String query) {
		DBController db = new DBController();
		String dbQuery;
		PreparedStatement pstmt;
		String returned;
		
		db.getConnection();
		
		dbQuery = "SELECT Meaning WHERE Term = 'term'";
		pstmt = db.getPreparedStatementWithKey(dbQuery);
		
		try {
			
		}
	}

}
