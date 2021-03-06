package Entity;

import Database.MatchmakingDA;

public class MatchmakingConsructor {
	private int id;
	private static String name;
	private static String age;
	private static int gender;
	private static String email;
	private static int preference;
	
	public MatchmakingConsructor() {
		super();
	}
	
	public MatchmakingConsructor(String name, String age, int gender, String email, int preference) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.preference = preference;
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
	public void setName(String name) {
		this.name = name;
	}
	public static String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public static int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getPreference() {
		return preference;
	}
	public void setPreference(int preference) {
		this.preference = preference;
	}
}
