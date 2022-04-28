package mypersons.test;

import java.util.Scanner;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;


public class PersonTest {
	
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
				System.out.println("Workplace:");
				str = in.nextLine();
				return new Adult(strArray[0],Integer.parseInt(strArray[1]),str);

			}
			
		}
		catch (Exception e) {
			ok = false;
		}
		}while(!ok);
		return null;
	}
	
}
