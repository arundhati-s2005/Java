// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;
class level2Q2 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Base of Triangle:");
        int base = input.nextInt(); 
		
		System.out.print("Enter the Height of Triangle:");
		int height = input.nextInt();
		
        double area=0.5*base*height;
        double feet=area/30.5;
        double inches=area*0.4; 
		System.out.println("Area of triangle in cm" +area+ "in feets" +feet+ "inches" +inches);
        input.close();
		}
		
	}
	