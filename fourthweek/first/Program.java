package first;


public class Program {

	public static void main(String[] args) {
		Employee[] emps = { new Employee("Pepsi Bela",100), 
							new Employee("Gyurcsany",150),
							new Employee("Walter White",450),
							new Employee("Fasz",1050)};
		printEmployees(emps);
		System.out.println("Highest salary: " + emps[getHighestSalary(emps)]);
		System.out.println("Salaries between 100 and 200: " + cntEmpsInRange(emps,100,200));
		System.out.println("Propaganda Avg Salary: " + propagandaAvgSalary(emps, 234));
		System.out.println("Total tax amount: " + totalTax(emps));
	}
	
	public static int totalTax(Employee[] emps) {
		int total = 0;
		for (Employee emp : emps) {
			total += emp.getTax();
		}
		return total;
	}
	
	public static double propagandaAvgSalary(Employee[] emps, double propagandaNumber) {
		double avg = 0;
		for(Employee emp : emps) {
			avg += emp.getSalary();
		}
		avg /= (double)emps.length;
		return avg + propagandaNumber;
	}
	
	public static void printEmployees(Employee[] emps) {
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}
	
	public static int getHighestSalary(Employee[] emps) {
		int max = 0;
		for(int i = 1; i < emps.length; i++) {
			if(emps[i].compare(emps[max])) {
				max = i;
			}
		}
		return max;
	}
	
	public static int cntEmpsInRange(Employee[] emps, int min, int max) {
		int db = 0;
		for(int i = 0;i<emps.length;i++) {
			if(emps[i].isSalaryInRange(min, max)) {
				db++;
			}
		}
		return db;
	}

}
