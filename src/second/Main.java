package second;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arrSize = read(1,15);
		String[] names = new String[arrSize];
		readNames(names);
		printNames(names);
		String search = read();
		if(isInArray(names, search)){
			System.out.println(search+" is in the array");
		} else {
			System.out.println(search + " is absent");
		}
		
		
	}
	public static int read(int min, int max){
		int number = 0;
		do{
			System.out.println("Give me a number between "+min+" and "+max+"!");
			while(!input.hasNextInt()){
				System.out.println("Bad input format");
				input.next();
			}
			number = input.nextInt();
			input.nextLine();
		}while(number < min || number > max);
		return number;
	}

	public static void readNames(String[] names){
		for (int i=0;i<names.length;i++){
			System.out.println("Name #"+(i+1)+":");
			names[i] = input.nextLine();
			
		}
	}
	public static String read(){
		System.out.println("Give me a swing!");
		return input.nextLine();
	}
	
	public static void printNames(String[] names){
		for (String name : names){
			System.out.println(name);
		}
	}
	public static boolean isInArray(String[] arr, String key){
		for (String elem : arr){
			if (elem.equals(key))
				return true;
		}
		return false;
	}
}
