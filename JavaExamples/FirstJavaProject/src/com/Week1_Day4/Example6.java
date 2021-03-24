package com.Week1_Day4;

class Box{
    double width;
    double height;
    double depth;
    public Box(double width, double height, double depth) {
        super();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    @Override
    public String toString() {
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }
    
    
}

public class Example6 {
	public static void main(String[] args) {
		Box b=new Box(10,12,14);
        System.out.println(b);
	}
}

