package joe;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number = scanner.nextInt();
	    if (number <= 1) {
	      System.out.println(number + " is not a prime number.");
	      return;
	    }
	    for (int i = 2; i <= number / 2; i++) {
	      if (number % i == 0) {
	        System.out.println(number + " is not a prime number.");
	        return;
	      }
	    }
	    System.out.println(number + " is a prime number.");

	}

}
