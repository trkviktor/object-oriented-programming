package mypersons;

public class Adult extends Person {

	private String work;
	
	@Override
	public String toString() {
		return "Adult [getWork()=" + getWork() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public Adult(String name, int age, String work) {
		super(name, age);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	
	
	
}
