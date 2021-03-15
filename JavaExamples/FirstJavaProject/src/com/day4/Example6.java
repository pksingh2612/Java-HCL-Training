package com.day4;

class Box{
	double weight;
	double height;
	double depth;
	public Box(double weight, double height, double depth) {
		super();
		this.weight = weight;
		this.height = height;
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "Box [weight=" + weight + ", height=" + height + ", depth=" + depth + "]";
	}
	
}

public class Example6 {
	public static void main(String[] args) {
		Box b = new Box(10,12,14);
		System.out.println(b);
	}
}

