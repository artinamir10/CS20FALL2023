package Skillbuilder;

import java.util.Scanner;

public class RectangularPerimeter {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter the width of the rectangle");
	double width = input.nextDouble();
	
	System.out.print("Please enter the length of the rectangle");
	double length = input.nextDouble();
	
	double perimeter = (width*2) + (length*2);
	System.out.print("The perimeter of the rectangle is: " + (perimeter));

	
	} 
}
