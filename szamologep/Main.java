package szamologep;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		repeatFunction();
	}
	
	
	public static void repeatFunction() {
		boolean ok;
		String inp;
		do {
			System.out.println("Desired equation: ");
			inp = in.nextLine();
			String[] strArray = inp.split(" ");
			ok = true;
		try {
			int a = Integer.parseInt(strArray[0]);
			char op = strArray[1].charAt(0);
			int b = Integer.parseInt(strArray[2]);
			System.out.printf("%d %c %d = %d",a,op,b,Calc(a,b,op));
			
		}
		catch (Exception e) {
			ok = false;
		}
		}while(!ok);
		
		
		
		
	}
	
	public static int Calc(int nmbr1,int nmbr2,char Operator) {
		int answ = 0;
		switch (Operator) {
		case '+': answ = nmbr1+nmbr2;
				break;
		case '-': answ = nmbr1-nmbr2;
				break;
		case '*': answ = nmbr1*nmbr2;
				break;
		case '/': answ = nmbr1/nmbr2;
				break;
		default: System.out.println("Error 1");
				break;
		}
		return answ;
	}

}
