package Database;

public class SignUpConstructor {
	private int id;
	private static String attendee;
	private static String event;
	
	public SignUpConstructor (String attendee, String event) {
		this.attendee = attendee;
		this.event = event;
	}

	public static String getEvent() {
		return event;
	}

	public static void setEvent(String event) {
		SignUpConstructor.event = event;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getAttendee() {
		return attendee;
	}

	public static void setAttendee(String attendee) {
		SignUpConstructor.attendee = attendee;
	}
}
