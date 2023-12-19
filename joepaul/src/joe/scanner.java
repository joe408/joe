package joe;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Rollno.");
		int rollno=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your fees");
		double fees=sc.nextDouble();
		System.out.println("Roll no."  + rollno +  "name"  +  name +  "fees"  +  fees);
		sc.close();
		
		
		

	}

}
