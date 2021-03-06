package com.Week1_Day2;

public class Example2 {
	public static void main(String[] args)
	{
		int a[]= {1,2,3}; //declaring and initializing the array -- correct
		
//		int a1[]; // declaring the array --wrong
//		a1[0]=1;
//		a1[1]=2;
//		
//		int a2[3]= {1,2,3}; //--wrong
		
		int a3[]=new int[3]; //declaraing the array --correct
		
		a3[0]=1;
		a3[1]=2;
		a3[2]=3;
		
		int[] a4= new int[3]; // declaraing the array --correct
		
		//int[] a5=new int[-3]; // correct - we can declare the index in negative but at runtime 
		  // it will show NegativearraySizeException
		
		int a6[]=new int[] {1,2,3}; // correct - Anonymous Array
		//int a7[]=new int[3] {1,2,3}; // wrong
		
		int a8[]=new int[4];
		a8[0]=10;
		a8[1]=11;
		a8[2]=12;
		a8[3]=13;
		
		for(int i=0;i<a8.length;i++)
			System.out.println(a8[i]);
		
		System.out.println();
		
		// JDK1.5 we introduce forEach statement
		// 1. variable should be declared only inside for loop and of same data type like array
		// 2. 1D array is stored in a vaiable, 2D array is stored in 1D array and so on
		
		for(int j:a8)
			System.out.println(j);
		
		System.out.println();
		
		int b[][]= {{1,2},{3,4}}; // correct- decalring and initializing the array
		
		//int b1[2][2]={{1,2},{3,4}}; //wrong
		
		int b1[][]=new int[2][2]; //correct
		int[][] b2=new int[2][2]; //correct
		int[] b3[]=new int[2][2]; //correct
		
		int b4[][] = new int[2][2]; //declaring
		b4[0][0]=1; b4[0][1]=2;
		b4[1][0]=3; b4[1][1]=4;
		
		for(int i=0;i<b4.length;i++) {
			for(int j=0;j<b4.length;j++) {
				System.out.println(b4[i][j]);
			}
		}
		
		System.out.println();
		
		for(int c1[]:b4)
			for(int d1:c1)
				System.out.println(d1);
		
		int b5[][] = new int[5][5]; // 5*5 =25*4=100 bytes of 
        b5[0][0] =1;
        b5[0][0] =2; 
        b5[1][1]=3;  // 12 bytes of memory is 
        
        
        // Array of Array - to avoid memory wastage
        // specify the size for only row
        int b6[][]= new int[5][];
        b6[0]= new int[2];
        b6[1]=new int[1];
        
        
//        b6[0][0]=1;
//        b6[0][0]
        
		
	}
}
