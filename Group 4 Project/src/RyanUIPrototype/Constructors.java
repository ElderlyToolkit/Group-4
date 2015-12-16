package RyanUIPrototype;

import RyanUIPrototype.DA;

public class Constructors {
	private int id;
	private static String name;
	private static int age;
	private static int gender;
	private static String email;
	private static int preference;
	
	public Constructors() {
		super();
	}
	
	public Constructors(String name, int age, int gender, String email, int preference) {
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
	public static int getAge() {
		return age;
	}
	public void setAge(int age) {
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
	
	public static void main (String[] args) {
		Constructors constructor = new Constructors ("Peter", 18, 1, "stupid@idiot.com", 1);
    	System.out.println(constructor);
    	int id= DA.createMatchmaking(constructor);
    	if (id>0) {
    		constructor.setId(id);
    		System.out.println("Entry was created");
    	}
	}
}
