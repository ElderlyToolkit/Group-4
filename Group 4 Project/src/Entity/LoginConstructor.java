package Entity;

public class LoginConstructor {
	private String name;
	private String password;
	private String permissions;
	
	public LoginConstructor (String name, String password, String permissions) {
		this.name = name;
		this.password = password;
		this.permissions = permissions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
}
