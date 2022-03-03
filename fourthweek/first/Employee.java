package first;

public class Employee {
	public String name;
	public int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", tax=" + getTax() + "]";
	}
	
	public boolean compare(Employee other) {
		return salary > other.salary;
	}
	
	public boolean isSalaryInRange(int min, int max) {
		return salary >= min && salary <= max;
	}
	
	public int getTax() {
		return (int) (salary * 0.16);
	}

	public void increaseSalary(int amount) {
		salary += amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
