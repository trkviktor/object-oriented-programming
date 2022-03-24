package mypersons;

public class Child extends Person{
	
	private String school;

	
	
	@Override
	public String toString() {
		return "Child [getSchool()=" + getSchool() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public Child(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	
	
	
}
