package Skillbuilder;

import java.util.Scanner;

public class GradeAvg_part1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the first grade: ");
		int first = input.nextInt();
		System.out.print("Please enter the second grade: ");
		int second = input.nextInt();
		System.out.print("Please enter the third grade: ");
		int third = input.nextInt();
		System.out.print("Please enter the fourth grade: ");
		int fourth = input.nextInt();
		System.out.print("Please enter the fifth grade: ");
		int fifth = input.nextInt();
		
		int avg = (first + second + third + fourth + fifth)/5;
		System.out.print("Your Average grade is: "+ avg);
		

	}

}
