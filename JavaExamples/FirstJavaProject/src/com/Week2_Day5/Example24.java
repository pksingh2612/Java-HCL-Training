package com.Week2_Day5;
import java.util.HashMap;
import java.util.Map;
public class Example24 {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
        hm.put(1, "java");
        hm.put(2, "java");
        System.out.println(hm);
        
         hm.compute(1,(key,oldval)->oldval.concat("Script"));
         hm.compute(2,(key,oldval)->oldval.concat("Technology"));
         System.out.println(hm);
         
         hm.compute(30,(key,oldval)->"Spring framework");
         System.out.println(hm);

	}

}
