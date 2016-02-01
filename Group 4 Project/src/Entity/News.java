package Entity;

public class News {
	private String article;
	private String headline;
	private String image;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public News(){}
	
	public News(String headline, String article) {
		this.headline = headline;
		this.article = article;
	}
	
	public News(String headline, String article, String image) {
		this.headline = headline;
		this.article = article;
		this.image = image;
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