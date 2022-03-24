package mypersons;

public class Employee extends Person{
	
	private int salary;
	private int retirementAge;
	
	
	
	@Override
	public String toString() {
		return "Employee [retirementAge=" + retirementAge + ", getSalary()=" + getSalary() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}

	public Employee(String name, int age, String work, int salary) {
		super(name, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	
	
	

}
