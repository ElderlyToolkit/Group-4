package Database;

public class EventSignUpConstructor {
	private String databaseAttendee;
	private String databaseEvent;
	
	public EventSignUpConstructor (String databaseAttendee, String databaseEvent) {
		this.databaseAttendee = databaseAttendee;
		this.databaseEvent = databaseEvent;
	}

	public String getDatabaseAttendee() {
		return databaseAttendee;
	}

	public void setDatabaseAttendee(String databaseAttendee) {
		this.databaseAttendee = databaseAttendee;
	}

	public String getDatabaseEvent() {
		return databaseEvent;
	}

	public void setDatabaseEvent(String databaseEvent) {
		this.databaseEvent = databaseEvent;
	}
}
