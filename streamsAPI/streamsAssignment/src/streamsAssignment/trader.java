package streamsAssignment;

public class trader {
	private final String name;
	private final String city;
	
	public trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Name:" + name + ", city:" + city;
	}
}
