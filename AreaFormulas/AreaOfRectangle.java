package AreaFormulas;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the leanth of the rectangle: ");
		double lengh = scanner.nextDouble();
		System.out.println("Enter the Width of the rectangle");
		double width = scanner.nextDouble();
		// Area = lenght*width;
		double area = lengh*width; 
		System.out.println("the area of rectangle is : "+area );

	}

}
