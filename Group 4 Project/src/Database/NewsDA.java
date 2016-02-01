package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.DBController;
import Entity.News;

public class NewsDA {
	public static String[] RetrieveHeadlines(int page, String category) {
		ResultSet rs = null;
		DBController db = new DBController();
		String[] Headlines = new String[6];
		int id;
		
		if (page == 1) {
			if (category == "World")
				id = 1;
			else
				id = 13;
		}
		
		else 
			if (category == "World")
				id = 7;
			else
				id = 19;
		
		
		for (int i = 0 ; i < 6 ; i++) {
			String dbQuery = "SELECT Headline FROM news WHERE id = '" + id + "'" + "AND page = '" + page + "'" + "AND Category = '" + category + "'";
			rs = db.readRequest(dbQuery);
			++id;
			try {
				while (rs.next()) {
						Headlines[i] = rs.getString("Headline");
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return Headlines;
		
	}
	
	public static ArrayList<News> RetrieveFrontPage(int page, String category) {
		ResultSet rs = null;
		DBController db = new DBController();
		ArrayList<News> news = new ArrayList<News>();
		News old;
		String headline = null, content = null, pics = null;
		int id;
		
		if (page == 1) {
			if (category == "World")
				id = 1;
			else
				id = 13;
		}
		
		else 
			if (category == "World")
				id = 7;
			else
				id = 19;
		
		
		for (int i = 0 ; i < 6 ; i++) {
			String dbQuery = "SELECT Headline, Content, Pics FROM news WHERE id = '" + id + "'" + "AND page = '" + page + "'" + "AND Category = '" + category + "'";
			rs = db.readRequest(dbQuery);
			++id;
			try {
				while (rs.next()) {
					headline = rs.getString("Headline");
					content = rs.getString("Content");
					pics = rs.getString("Pics");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			old = new News(headline, content, pics);
			news.add(old);
		}
		
		return news;
		
	}
}
