//1.Inheritance 1 - Illustration
// 
// 
// 
//The task is to calculate the area of the shape using a menu driven application.
// 
//Write a Java program to Implement this task.
// 
// 
// 
//Create a class called Shape.
// 
//Include the following protected data members / attributes:
// 
//shapeName ? of type String
// 
//Include the following methods :
// 
//Create a constructor that initializes the shapeName
//calculateArea ?  The return type of this method is Double. This method returns 0.
// 
// 
// 
// 
//Create a class called Square that extends Shape
// 
//Include the following private data members / attributes:
// 
//side ? of type Integer.
// 
//Include the following methods :
// 
//Create a constructor that initializes the side. (1-argument constructor). Initialize the shapeName as "Square".
// 
//calculateArea ? calculates and returns the area of the square. The return type of this method is Double.
// 
// 
// 
//Create a class called Rectangle that extends Shape
// 
//Include the following private data members / attributes:
// 
//length ? of type Integer.
// 
//breadth ? of type Integer.
// 
//Include the following methods :
// 
//Create a constructor that initializes the length and breadth. (2-argument constructor). Initialize the shapeName as "Rectangle".
// 
//calculateArea - calculates and returns the area of the rectangle. The return type of this method is Double.
// 
// 
// 
//Create a class called Circle that extends Shape
// 
//Include the following private data members / attributes:
// 
//radius ? of type Integer.
// 
//Include the following methods :
// 
//Create a constructor that initializes the radius. (1-argument constructor). Initialize the shapeName as "Circle".
// 
//calculateArea ? calculates and returns the area of the circle. The return type of this method is Double.
// 
// 
//Include appropriate getters and setters.
// 
// 
//Input and Output Format:
// 
//Refer sample input and output for formatting specifications.
// 
//All text in bold corresponds to input and the rest corresponds to output.
// 
// 
//Format the output with two decimal points
// 
// 
//Sample Input and Output 1:
// 
//1. Rectangle
// 
//2. Square
// 
//3. Circle
// 
//Area Calculator --- Choose your shape
// 
//1
// 
//Enter length and breadth:
// 
//100
// 
//40
// 
//Area of Rectangle is:4000.00
// 
// 
// 
//Sample Input and Output 2:
// 
//1. Rectangle
// 
//2. Square
// 
//3. Circle
// 
//Area Calculator --- Choose your shape
// 
//2
// 
//Enter side:
// 
//20
// 
//Area of Square is:400.00
// 
// 
// 
//Sample Input and Output 3:
// 
//1. Rectangle
// 
//2. Square
// 
//3. Circle
// 
//Area Calculator --- Choose your shape
// 
//3
// 
//Enter Radius:
// 
//5
// 
//Area of Circle is:78.54
package com.handson5;

import java.util.Scanner;

class Shape{
	protected String shapeName;

	public Shape() {
		super();
	}
	
	double calculateArea() {
		return 0;
	}
	 
}

class Square extends Shape
{
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}
	double calculateArea() {
		return side*side;
	}
	
}

class Rectangle extends Shape
{
	private int length;
	private int  breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	double calculateArea() {
		return length*breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	double calculateArea() {
		return 3.14*radius*radius;
	}
}

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int ch;
		do
		{  
			System.out.println("Menu "); 
			System.out.println("Press 1 for Rectangle "); 
			System.out.println("Press 2 for Square "); 
			System.out.println("Press 3 for Circle "); 
			System.out.println("Press 4 for Exit");
			System.out.println("Area Calculator --- Choose your shape");
		    ch=sc.nextInt();
		    switch(ch) {
		    case 1:
		    	System.out.print("Enter length and breadth :");
		    	Rectangle rectangle = new Rectangle(sc.nextInt(),sc.nextInt());
		    	System.out.println("Area of Circle :"+rectangle.calculateArea());
		    	break;
		    case 2:
		    	System.out.print("Enter side: ");
		    	Square square = new Square(sc.nextInt());
		    	System.out.println("Area of Circle :"+square.calculateArea());
		    	break;
		    case 3:
		    	System.out.println("Enter Radius: ");
		    	Circle circle = new Circle(sc.nextInt());
		    	System.out.println("Area of Circle :"+circle.calculateArea());
		    	break;
		    case 4:
		    	System.exit(0); 
		    	break;
		    default:
		    	System.out.println("Wrong Key Pressed!!"); 
		    	break;
		    }
		}while(true);  

	}

}
