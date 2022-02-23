package szamologep;

import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int nmbr1 = read(0,100);
		char Op = read();
		int nmbr2 = read(0,100);
		if(Op == '/' && (nmbr2==0)) {
			System.out.println("You cant divide by zero!");
			nmbr2 = read(0,100);
		}
		System.out.printf("%d %c %d = %d",nmbr1,Op,nmbr2,Calc(nmbr1,nmbr2,Op));
	}
	
	public static int read(int min,int max) {
		int number = 0;
		do {
			System.out.printf("\nEnter a number between: %d and %d:",min,max);
			while(!in.hasNextInt()) {
				System.out.printf("\nThe number must be between %d and %d:",min,max);
				in.next();
			}
			number = in.nextInt();
			in.nextLine();
		}while(number < min || number > max);
		return number;
	}
	
	public static char read() {
		char Operator;
		boolean good = false;
		String Operators = "+-*/";
		do {
			System.out.println("Enter a basic operator(+-*/):");
			Operator = in.next().charAt(0);
			in.nextLine();
			for(int i = 0; i<Operators.toCharArray().length;i++){
				if(Operator == Operators.charAt(i))	
					good = true;
			}
		}while(!good);
		return Operator;
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
