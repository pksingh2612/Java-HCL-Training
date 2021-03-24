package com.Week1_Day3;
class Figure{
    void area() {
        System.out.println("figure area");
        
    }
}
class Rectangle extends Figure{
    void area() {
        System.out.println("rectangle area");
    }
}
class Triangle extends Figure{
    void area() {
        System.out.println("triangle area");
    }
}
public class Example5 {

	public static void main(String[] args) {
		Figure f=new Rectangle();
        f.area();
        f=new Triangle();
        f.area();
        f=new Figure();
        f.area();
	}

}
