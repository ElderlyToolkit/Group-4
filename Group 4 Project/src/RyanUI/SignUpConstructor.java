package RyanUI;

public class SignUpConstructor {
	private int id;
	private static String attendee;
	
	public SignUpConstructor (String attendee) {
		this.attendee = attendee;
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
