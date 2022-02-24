package third;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int matrix[][] = {{ 1, 2, 3 },{ 4, 5, 6},{ 69, 70, 71}};
		printMatrix(matrix);
		int jagged[][] = {{ 1, 2, 3, 4},{ 4, 5, 6, 7, 8 , 9},{ 69,70, 71}};
		printMatrix(jagged);
		int search = read(1,100);
		System.out.println(searchMatrix(matrix,search));

	}
	
	public static void printMatrix(int[][] matrix){
		for(int row = 0; row < matrix.length; row++){
			System.out.print("[ ");
			for(int column = 0; column < matrix[row].length;column++){
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println("]");
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
	public static boolean searchMatrix(int[][] matrix,int search){
		for(int row = 0; row < matrix.length; row++){
				for(int column = 0; column < matrix[row].length;column++){
						if(search == matrix[row][column]){
							return true;
						}
						
					}
				}
		return false;
		}
		
			
	}

