package Skillbuilder;

import java.util.Scanner;
import java.text.NumberFormat;
public class GradeAvg_part2 {
	public static void main(String[] args) {
		
		
		int Total = 0;
	
	NumberFormat average = NumberFormat.getPercentInstance();
	Scanner input = new Scanner (System.in);
	System.out.print("Please enter the first grade: ");
	int first = input.nextInt();
	Total += first;
	System.out.print("Please enter the second grade: ");
	int second = input.nextInt();
	Total += second;
	System.out.print("Please enter the third grade: ");
	int third = input.nextInt();
	Total += third;
	System.out.print("Please enter the fourth grade: ");
	int fourth = input.nextInt();
	Total += fourth;
	System.out.print("Please enter the fifth grade: ");
	int fifth = input.nextInt();
	Total += fifth;
	double AVG = ((double)Total/5.0);
	System.out.print(average.format(AVG/100));
	}
}
