package Entity;

public class ChatboxConstructor {
	private int id;
	private static String message;
	
	
	public ChatboxConstructor() {
		super();
	}
	
	public ChatboxConstructor(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		ChatboxConstructor.message = message;
	}
}