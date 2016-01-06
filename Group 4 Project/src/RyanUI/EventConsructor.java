package RyanUI;

import RyanUI.MatchmakingDA;

public class EventConsructor {
	private int id;
	private static String name;
	private static String time;
	private static String description;
	private static String location;
	private static String organiser;
	private static String date;
	
	
	public EventConsructor() {
		super();
	}

	public EventConsructor(String name, String time, String date, String description, String location, String organiser) {
		this.name = name;
		this.time = time;
		this.description = description;
		this.location = location;
		this.organiser = organiser;
		this.date = date;
	}

	public static String getDate() {
		return date;
	}

	public static void setDate(String date) {
		EventConsructor.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		EventConsructor.name = name;
	}

	public static String getTime() {
		return time;
	}

	public static void setTime(String time) {
		EventConsructor.time = time;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		EventConsructor.description = description;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		EventConsructor.location = location;
	}

	public static String getOrganiser() {
		return organiser;
	}

	public static void setOrganiser(String organiser) {
		EventConsructor.organiser = organiser;
	}
}
