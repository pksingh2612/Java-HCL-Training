package com.Week1_Day2;
class Box5{
    double height;
    double depth;
    double width;
    Box5(){
        width=-1;
        depth=-1;
        height=-1;
        }
    Box5(Box b){
        width=b.width;
        height=b.height;
        depth=b.depth;
    }
    Box5(int len){
        width=height=depth=len;
    }
    Box5(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume() {
        return width*height*depth;
        
    }
}
class BoxWeight1 extends Box5{
    double cost;
    BoxWeight1(){
    width=-1;
    height=-1;
    depth=-1;
    cost=-1;
}
    BoxWeight1(double w,double h,double d,double c){
        width=w;
        height=h; 
        depth=d; 
        cost=c;
    }

}
public class Example15 {

	public static void main(String[] args) {
		 BoxWeight1 b1=new BoxWeight1();
	        BoxWeight1 b2=new BoxWeight1(1,2,3,4);
	        double vol;
	        vol=b1.volume();
	        System.out.println("volume is"+vol);
	        System.out.println("cost is"+b1.cost);
	        vol=b2.volume();
	        System.out.println("volume is"+vol);
	        System.out.println("cost is"+b2.cost);

	}

}
