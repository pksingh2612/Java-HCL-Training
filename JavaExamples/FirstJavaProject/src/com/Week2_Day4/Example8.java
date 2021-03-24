package com.Week2_Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) throws IOException {
		 /*Scanner s=new Scanner(System.in);
        System.out.println("Enter age");
        int age=s.nextInt();
        s.nextLine();
        System.out.println("Enter the name");
        String name =s.nextLine();
        System.out.println(age+" "+name);*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age");
        String s=br.readLine();
        int age=Integer.parseInt(s);
	}

}
