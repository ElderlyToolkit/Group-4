package Entity;

public class Dictionary {
	private String meaning;
	private String term;
	private String example;
	
	public Dictionary(String meaning,String term,String example) {
		this.meaning = meaning;
		this.term = term;
		this.example = example;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}
	
	
}
