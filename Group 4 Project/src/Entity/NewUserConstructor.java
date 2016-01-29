package Entity;

public class NewUserConstructor {
	private int id;
	private static String name;
	private static int age;
	private static int gender;
	private static String email;
	private static String password;
	private static String permission;
	private static String photo;
	
	public NewUserConstructor() {
		super();
	}
	
	public NewUserConstructor(String name, int age, int gender, String email, String password, String permission, String photo) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.permission = permission;
		this.photo = photo;
	}
	
	public static String getPhoto() {
		return photo;
	}

	public static void setPhoto(String photo) {
		NewUserConstructor.photo = photo;
	}

	public static String getPermission() {
		return permission;
	}

	public static void setPermission(String permission) {
		NewUserConstructor.permission = permission;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		NewUserConstructor.password = password;
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
}
