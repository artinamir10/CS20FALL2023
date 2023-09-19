package Skillbuilder;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a two digit number: ");
		int digit = input.nextInt();
		int Division = digit/10;
		System.out.println(Division);
		int second = digit%10;
		System.out.print(second);
		
		
		
		
		
	}

}
