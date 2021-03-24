package com.Week2_Day5;

import java.util.HashMap;
import java.util.Map;

public class Example21 {

	public static void main(String[] args) {
		
		Map<Double,Double> hm=new HashMap<>();
        hm.put(2.0, 3.0);
        hm.put(3.0, 4.0);
        hm.put(2.0, 4.0);
        
        hm.replaceAll((n1,n2) ->Math.pow(n1,n2));
        hm.forEach((k,v)->System.out.println(k+" "+v));
        
        Map<Integer,String> hm1=new HashMap<>();
        hm1.put(1000, "Ram");
        hm1.put(2000, "Sam");
        hm1.put(3000, "Raj");
        String s=hm1.putIfAbsent(1001, "Ramu");
        System.out.println(s);
        System.out.println(hm1.get(1001));
        String s1=hm1.putIfAbsent(1000, "Rajan");
			
			
		
	}

}
