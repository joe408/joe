package joe;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = reader.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("The entered number is even");
		}
		else
			System.out.println("number is odd");
		
		}

	}


