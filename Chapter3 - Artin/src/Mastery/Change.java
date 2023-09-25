/*

Program: change.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that displays number in 
 multiples of ten.

Author: Artin Amirfakhrian 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;


public class Change {

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter an amount less then $1.00 in cents: ");
		
		int amount = input.nextInt();
		
		int quarters = amount/25;
		
		System.out.println("quarters: "+quarters);
		
		int dimes = ((amount)-(quarters*25))/10;
		
		System.out.println("dimes: "+dimes);
		
		int nickles = ((amount)-((quarters*25)+(dimes*10)))/5;
		
		System.out.println("nickles: "+nickles);
		
		int pennies = ((amount)-((quarters*25)+(dimes*10)+(nickles*5)))/1;
		
		System.out.println("pennies: "+ pennies);
		
		
	}

}
