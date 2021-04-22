package com.Week1_Day2;

import java.util.Scanner;
public class Example0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student:");
		int num = sc.nextInt();
		
		String[] drill = new String[num+1];
	      for (int i = 0; i <= num; i++) {
	          drill[i] = sc.nextLine();
	      }
	      for (int i = 0; i <= num; i++) {
	          for (int j = i + 1; j < drill.length; j++) {
	              if (drill[i].compareTo(drill[j]) > 0) {
	                  String temp = drill[i];
	                  drill[i] = drill[j];
	                  drill[j] = temp;
	              }
	          }
	      }
	      for (int i = 0; i <= num; i++) {
	          System.out.println(drill[i]);
	      }

		
		int column,row;
		row=column=(int)Math.sqrt((double)num);
//		System.out.println(row);
//		System.out.println(column);
		String [][] mat1 = new String[row+1][column+1]; // 2D
		String [] middleRow = new String[row+1]; // 1D
		String [] middleColumn = new String[column+1]; // 1D
		// input
		int z=1;
		for(int i=0;i<row;++i) {
			for(int j=0;j<column;++j) {
				mat1[i][j]=drill[z];//sc.nextLine();
				z++;
			}
		}

//		//output
		System.out.println("Our 2D Array : ");
		for(int i=0;i<row;++i) {
			for(int j=0;j<column;++j) {
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		//processing
		//row --> i common
		System.out.print("Middle row : ");
		for(int j=0;j<row;++j) {
			middleRow[j]=mat1[1][j];
			System.out.print(middleRow[j]+" ");
		}
	
		System.out.println();
		System.out.print("Middle column : ");
		//column --> j common
		
		for(int i=0;i<column;++i) {
			middleColumn[i]=mat1[i][1];
			System.out.print(middleColumn[i]+" ");
		}
		
	}


}
