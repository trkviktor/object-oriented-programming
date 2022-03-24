package mypersons.test;

import java.util.Scanner;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;
import mypersons.Employee;

public class EmployeeTest {

		
static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = read(0,10);
		Person[] persons = new Person[n];
		fillArray(persons);
		
//		Person[] persons = {new Child("Kakusz",6,"kazi"),
//							new Adult("Vakusz",23,""),
//							new Employee("Zakusz",19,"prodhost",4383)};
		
		System.out.println("Before sorting: ");
		printArray(persons);
		System.out.println("After sorting: ");
		sortArray(persons);
		printArray(persons);
		
		
//		if(p1 instanceof Child) {
//			System.out.println("It's a Child " + p1);
//		} else if(p1 instanceof Adult) {
//			System.out.println("It's an Adult " + p1);
//		} else {
//			System.out.println("It's an Employee " + p1);
//		}
//		

		
		
		
		
	}
	
	
	public static void printArray(Person[] persons) {
		for(Person ppl : persons) {
			System.out.println(ppl);
		}
	}
	
	public static void sortArray(Person[] persons) {
		int minIndex = 0;
		for(int i = 1; i < persons.length; i++) {
			if(persons[minIndex].getAge() < persons[i].getAge())
				minIndex = i;
			
			Person temp = persons[i];
			persons[i] = persons[minIndex];
			persons[minIndex] = temp;
		}
		
	}
	
	public static int read(int min, int max) {
		int number = 0;
		do{
			System.out.println("Give me a number between "+min+" and "+max+"!");
			while(!in.hasNextInt()){
				System.out.println("Bad input format");
				in.next();
			}
			number = in.nextInt();
			in.nextLine();
		}while(number < min || number > max);
		return number;
	}
	
	public static void fillArray(Person[] persons) {
		for(int i = 0; i < persons.length; i++) {
			boolean ok;
			String inp;
			do {
				System.out.println("Name,age:");
				inp = in.nextLine();
				String[] strArray = inp.split(",");
				String str;
				ok = true;
			try {
				if(Integer.parseInt(strArray[1]) < 18){
					System.out.println("School:");
					str = in.nextLine();
					persons[i] = new Child(strArray[0],Integer.parseInt(strArray[1]),str);
				}else {
					System.out.println("Workplace:");
					str = in.nextLine();
					if(str.isEmpty()) {
						persons[i] = new Adult(strArray[0],Integer.parseInt(strArray[1]),str);
					} else {
						System.out.println("Salary:");
						String salaryIn = in.nextLine();
						persons[i] = new Employee(strArray[0],Integer.parseInt(strArray[1]),str,Integer.parseInt(salaryIn));
					}
				}
				
			}
			catch (Exception e) {
				ok = false;
			}
			}while(!ok);
		}
	}
	
}
