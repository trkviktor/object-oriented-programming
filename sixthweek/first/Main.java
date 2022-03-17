package first;

import java.util.Arrays;
import java.util.Comparator;
import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		Employee[] emps = { new Employee("Linux Lenke", LocalDate.of(1957, 12, 02), 120000),
                new Employee("BSD Bela", 1999, 01, 31, 32000), new Employee("Processz Petike", "2001-05-20", 250000),
                new Employee("Juniksz Janos", 1952, 2, 28, 123000), new Employee("Bitkolyin Bela", 1974, 4, 04, 95500),
                new Employee("Processz Panna", "1972-04-20", 220000),
                new Employee("Szemafor Szandra", 2001, 1, 12, 21000), new Employee("SSD Sanyi", 1950, 8, 14, 120000),
                new Employee("Gigabit Geza", 2004, 7, 12, 75000), new Employee("Torrent Gyuszi", 1923, 5, 24, 400000) };
       
		printEmployees(emps);
//		Employee.setRetirementAge(40);
//		System.out.println("\nRet. age set to 40:");
		printEmployees(emps);
		System.out.println("\n***Employees with less than 10 years till retirement:");
		printEmployeesCloseToRetirement(emps,10);
//		Arrays.sort(emps, (a,b) -> a.getYearsUntilRetirement() - b.getYearsUntilRetirement());
		Arrays.sort(emps, (a,b) -> a.getName().compareTo(b.getName()));
		printEmployees(emps);
	}

	
	
	public static void printEmployees(Employee[] emps) {
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
	
	public static void printEmployeesCloseToRetirement(Employee[] emps, int x) {
		for (int i = 0;i < emps.length;i++) {
			if(emps[i].getYearsUntilRetirement() < x)
				System.out.println(emps[i].toString());
		}
	}
}
