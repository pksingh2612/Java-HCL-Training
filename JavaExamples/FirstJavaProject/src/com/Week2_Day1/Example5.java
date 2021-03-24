package com.Week2_Day1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Example5 {

	public static void main(String[] args) {
		/*HashSet<String> s=new HashSet<>();
        System.out.println(s.size());
        s.add("v");
        s.add("c");
        s.add("f");
        s.add("a");
        s.add("r");
        s.add("y");
        System.out.println(s.size());//6
        System.out.println(s);*/
        
        /*LinkedHashSet<String> s=new LinkedHashSet<>();
        System.out.println(s.size());
        s.add("v");
        s.add("c");
        s.add("f");
        s.add("a");
        s.add("r");
        s.add("y");
        System.out.println(s.size());//6
        System.out.println(s);*/
        
          TreeSet<String> s=new TreeSet<>();
            System.out.println(s.size());
            s.add("v");
            s.add("c");
            s.add("f");
            s.add("a");
            s.add("r");
            s.add("y");
            System.out.println(s.size());//6
            System.out.println(s);
            System.out.println(s.first());
            System.out.println(s.last());
            System.out.println(s.headSet("f"));
            System.out.println(s.tailSet("f"));
            
            TreeSet<Integer> ts=new TreeSet<>();
            ts.add(12);
            ts.add(11);
            ts.add(16);
            ts.add(15);
            System.out.println(ts);//11 12 115 16
            //return the smallest elt greater than or 
            //eql to given elt
            System.out.println(ts.ceiling(13));//15
            //return the greatest elt less than or eql
            //to given elt
            System.out.println(ts.floor(13));//12
            //retrives and removes the first elt
            System.out.println(ts.pollFirst());
            //retrives and removes the last elt
            System.out.println(ts.pollLast());
            System.out.println(ts);
            

	}

}
