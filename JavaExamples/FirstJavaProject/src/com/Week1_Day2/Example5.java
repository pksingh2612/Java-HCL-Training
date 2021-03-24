package com.Week1_Day2;

class Box2{
	double width;
	double height;
	double depth;

	// default constructor will be replace by our own created constructor
	public Box2() {
		super();
		width=10;
		height=20;
		depth=15;
	}

	// parameterized constructor
	public Box2(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width*height*depth;
	}
}

public class Example5 {
	public static void main(String[] args)
	{
		Box2 b1 = new Box2();
		Box2 b2 = new Box2();
        Box2 b3 = new Box2(3,6,9);
        Box2 b4 = new Box2(5,10,12);
		double vol;
		vol=b1.volume();
		System.out.println("Volume is "+vol);
		vol=b2.volume();
        System.out.println("Volume is "+vol);
        vol=b3.volume();
        System.out.println("Volume is "+vol);
		vol=b4.volume();
        System.out.println("Volume is "+vol);
	}
}
