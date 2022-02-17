package first;

import java.util.Scanner;


public class Main {
	
		static Scanner input = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			int n = read(1, 10);
			printRPrimes(n, 10);
			
			
		}
		
		public static void printRPrimes(int N, int start){
			int rPrimeCnt = 0;
			while(rPrimeCnt < N){
				for(int i=2;i<start;i++){
					if(GCD(start,i) == 1){
						rPrimeCnt++;
						System.out.println("first: "+i+" second: "+start);
					}
					if(rPrimeCnt >= N){
						break;
					}
				}
				start++;
			}
			
		}
		
		public static int GCD(int a, int b){
			if (b == 0){
				return(a);
			}
			return GCD(b, a % b);
		}
		
		public static int read(int min, int max){
			int number = 0;
			do{
				System.out.println("Give me a number between "+min+" and "+max+"!");
				while(!input.hasNextInt()){
					System.out.println("Bad inpu format");
					input.next();
				}
				number = input.nextInt();
				input.nextLine();
			}while(number < min || number > max);
			return number;
		}
	
}
