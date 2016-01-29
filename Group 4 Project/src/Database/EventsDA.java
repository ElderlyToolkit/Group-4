package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.MutableComboBoxModel;

import RyanUI.Events;

public class EventsDA {
	
    public static int createEvent(EventConsructor eventconstructor){
    	DBController db=new DBController();
    	String dbQuery;
    	PreparedStatement pstmt;
    	int id=-1;
    	
    	//step 1: establish connection to database
    	db.getConnection();
    	
    	//step 2: declare the SQL statement
    	dbQuery="INSERT INTO events(name, time, date, description, location, organiser) values (?,?,?,?,?,?)";
    	pstmt=db.getPreparedStatementWithKey(dbQuery);
    	
    	//step 3: to insert record
    	try {
    		pstmt.setString(1,EventConsructor.getName());
    		pstmt.setString(2, EventConsructor.getTime());
    		pstmt.setString(3, EventConsructor.getDate());
    		pstmt.setString(4,EventConsructor.getDescription());
    		pstmt.setString(5,EventConsructor.getLocation());
    		pstmt.setString(6, EventConsructor.getOrganiser());
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
    
    public static String returnAttendee(String event) {
    	ResultSet rs = null;
		String databaseAttendee = null, databaseEvent = null;
		DBController db=new DBController();
		
		String dbQuery = "SELECT * FROM attendee WHERE event='" + event + "'";
		
		//queries database
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
			    databaseAttendee = rs.getString("attendee") + ", ";
			    databaseEvent = rs.getString("event");
			    System.out.println(databaseAttendee);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return databaseAttendee;
    }
    
    public static String returnAllEvents(String time) {
    	ResultSet rs = null;
		String date = Events.Date, events = null;
		DBController db=new DBController();
		
		String dbQuery = "SELECT * FROM events WHERE date='" + date + "' AND time='" + time + "'";
		
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
			    events = rs.getString("description");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return events;
    }
    
    public static String returnEventOrganiser (String time, String event) {
    	ResultSet rs2 = null;
		String name = null, date = Events.Date;
		DBController db2 = new DBController();
		
		
		
		String dbQueryNext = "SELECT * FROM events WHERE date='" + date + "' AND time='" + time + "' AND description='" + event + "'";
		
		rs2 = db2.readRequest(dbQueryNext);
		try {
			while (rs2.next()) {
				name = rs2.getString("name");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return name;
    }
    
    public static String returnEventLocation (String time, String event) {
    	ResultSet rs2 = null;
		String date = Events.Date, location = null;
		DBController db2 = new DBController();
		
		
		
		String dbQueryNext = "SELECT * FROM events WHERE date='" + date + "' AND time='" + time + "' AND description='" + event + "'";
		
		rs2 = db2.readRequest(dbQueryNext);
		try {
			while (rs2.next()) {
				location = rs2.getString("location");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return location;
    }
    
    public static EventSignUpConstructor returnAttendeeNEvent(String attendee, String event) {
    	String databaseAttendee = null;
		String databaseEvent = null;
		DBController db=new DBController();
		ResultSet rs2;
		
		String dbQuery = "SELECT * FROM attendee WHERE attendee='" + attendee + "' AND event='" + event + "'";
		
		rs2 = db.readRequest(dbQuery);
		
		try {
			while (rs2.next()) {
			    databaseAttendee = rs2.getString("attendee");
			    databaseEvent = rs2.getString("event");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		EventSignUpConstructor constructor = new EventSignUpConstructor(databaseAttendee, databaseEvent);
		return constructor;
    }
}