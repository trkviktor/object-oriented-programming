package mypersons;

public class Adult extends Person {

	private String workplace;
	
	@Override
	public String toString() {
		return "Adult [getworkplace()=" + getworkplace() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public Adult(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
	}

	public String getworkplace() {
		return workplace;
	}

	public void setworkplace(String workplace) {
		this.workplace = workplace;
	}
	
	
	
	
}
