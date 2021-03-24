package com.Week1_Day2;


//parent class or base class
class Box4{
	double width;
	double height;
	double depth;

	// default constructor will be replace by our own created constructor
	Box4() {
		width=10;
		height=20;
		depth=15;
	}

	// parameterized constructor
	Box4(Box4 b) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}
	
	Box4(int len) {
		width = height = depth=len;
	}
	
	Box4(double w, double h, double d) {
		width = w;
		height = h;
		depth=d;
	}

	double volume() {
		return width*height*depth;
	}
}


//child class
class BoxWeight extends Box4{
	double cost;
	
	BoxWeight(){
		width=1;
		height=1;
		depth=1;
		cost=1;
	}
	
	BoxWeight(double w, double h, double d, double c){
		width=w;
		height=h;
		depth=d;
		cost=c;
	}
	
}
public class Example14 {

	public static void main(String[] args) {
		BoxWeight b1= new BoxWeight();
		BoxWeight b2 = new BoxWeight(1,2,3,4);
		double vol;
		vol=b1.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Cost is "+b1.cost);
		vol=b2.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Cost is "+b2.cost);
	}

}
