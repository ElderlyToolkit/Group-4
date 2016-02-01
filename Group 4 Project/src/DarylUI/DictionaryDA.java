package DarylUI;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Database.DBController;
import Entity.Dictionary;

public class DictionaryDA {
	public static Dictionary retrieveMeaning(String txt) {
		Dictionary dictionary;
		ResultSet rs = null;
		DBController db = new DBController();
		String Meaning = "Meaning: " , Example = "Usage: "; 
		String term = txt;
		String dbQuery = "SELECT Term, Meaning, Example FROM dictionary WHERE Term = '" + term + "'";
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
				Meaning += rs.getString("Meaning");
				Example += rs.getString("Example");
			}
		} catch (SQLException z) {
			z.printStackTrace();
		}	
		
		dictionary = new Dictionary(Meaning,term,Example);
		return dictionary;
	}
}
