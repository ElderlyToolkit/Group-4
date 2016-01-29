package Entity;

public class DeleteEventConstructor {
	private String event;
	private String location;
	private String name;
	
	public DeleteEventConstructor (String event, String location, String name) {
		this.event = event;
		this.location = location;
		this.name = name;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
