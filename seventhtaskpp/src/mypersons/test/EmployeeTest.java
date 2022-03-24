package mypersons.test;

import java.util.Scanner;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;
import mypersons.Employee;

public class EmployeeTest {

		
static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Person p1 = read();
		Person p2 = read();		
		if(p1 instanceof Child) {
			System.out.println("Its a child\n " + p1);
		} else {
			System.out.println("Its an adult\n " + p1);
		}
		if(p2 instanceof Child) {
			System.out.println("Its a child\n " + p2);
		} else {
			System.out.println("Its an adult\n " + p2);
		}
		
	}
	
	public static Person read() {
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
				return new Child(strArray[0],Integer.parseInt(strArray[1]),str);
			}else {
				System.out.println("Work:");
				str = in.nextLine();
				if(str.isEmpty()) {
					return new Adult(strArray[0],Integer.parseInt(strArray[1]),str);
				} else {
					String salaryIn = in.nextLine();
					return new Employee(strArray[0],Integer.parseInt(strArray[1]),str,Integer.parseInt(salaryIn));
				}
			}
			
		}
		catch (Exception e) {
			ok = false;
		}
		}while(!ok);
		return null;
	}
	
}
