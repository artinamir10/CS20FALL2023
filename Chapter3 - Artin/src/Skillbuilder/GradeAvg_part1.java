/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Artin Amirfakhrian 
School: CHHS
Course: Computer Science 20


*/
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
/* Screen Dump
Please enter the first grade: 5
Please enter the second grade: 7
Please enter the third grade: 9
Please enter the fourth grade: 100
Please enter the fifth grade: 90
Your Average grade is: 42
 */
