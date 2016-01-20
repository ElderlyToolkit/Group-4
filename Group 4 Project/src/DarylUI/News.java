package DarylUI;

public class News {
	private String article;
	private String headline;
	
	public News(String headline, String article) {
		this.headline = headline;
		this.article = article;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
}