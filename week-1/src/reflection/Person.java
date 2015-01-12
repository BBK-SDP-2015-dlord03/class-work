package reflection;

public class Person {

	private String name;
	private String userId;
	
	public Person() {
		this("David", "dlord03");
	}
	
	public Person(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return this.getClass() + " Name: " + this.getName() + " UserId: " + this.getUserId();
	}
	
}
