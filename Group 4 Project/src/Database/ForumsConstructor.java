package Database;

public class ForumsConstructor {
	private int id;
	private static String message;
	private static String category;
	private static String subject;
	
	public ForumsConstructor(String message, String category, String subject){

		this.message = message;
		this.category = category;
		this.subject = subject;
		
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
		ForumsConstructor.message = message;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		ForumsConstructor.category = category;
	}

	public static String getSubject() {
		return subject;
	}

	public static void setSubject(String subject) {
		ForumsConstructor.subject = subject;
	}
	

}
