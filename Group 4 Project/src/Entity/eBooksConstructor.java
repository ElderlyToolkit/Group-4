package Entity;

public class eBooksConstructor {
	private String category;
	private String content;
	
	public eBooksConstructor(String category, String content){
		this.category = category;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
