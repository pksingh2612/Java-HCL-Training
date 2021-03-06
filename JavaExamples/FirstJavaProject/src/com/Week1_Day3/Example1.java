package com.Week1_Day3;

class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(){
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(int len){
		width=height=depth=len;
	}
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	double volume() {
		return width*height*depth;
	}
}

class BoxWeigth extends Box{
	double weight;
	
	BoxWeigth(){
		super();
		weight=-2;
	}
	BoxWeigth(double w, double h, double d, double we){
		super();
		weight=we;
	}
	BoxWeigth(int len, double we){
		super();
		weight=we;
	}
	BoxWeigth(BoxWeigth ob){
		super(ob);
		weight=ob.weight;
	}
}

class Shipment extends BoxWeigth{
	double cost;
	
	Shipment(){
		super();
		cost=1;
	}
	Shipment(double w, double h, double d, double we,double c){
		super();
		cost=we;
	}
	Shipment(int len, double we, double c){
		super();
		cost=c;
	}
	Shipment(Shipment ob){
		super(ob);
		cost=ob.cost;
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		Shipment s1=new Shipment();
		Shipment s2=new Shipment(1,2,3,4,5);
		Shipment s3=new Shipment(3,6,9);
		Shipment s4=new Shipment(s2);
		double vol;
		vol=s1.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Weight is "+s1.weight);
		System.out.println("Volume is "+s1.cost);
		vol=s2.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Weight is "+s2.weight);
		System.out.println("Volume is "+s2.cost);
		vol=s3.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Weight is "+s3.weight);
		System.out.println("Volume is "+s3.cost);
		vol=s4.volume();
		System.out.println("Volume is "+vol);
		System.out.println("Weight is "+s4.weight);
		System.out.println("Volume is "+s4.cost);
	}

}
