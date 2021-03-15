//Problem Statement:
//
//Write a program that draws the following figures one above the other.
//
// 
//
//* * * * *             * 
//
//* * * * *            * * 
//
//* * * * *           * * *
//
//* * * * *         * * * * *
//
// 
//
//Now modify it to draw them next to each other like earlier.

package com.handson2;

public class Problem6 {

	public static void main(String[] args) {
		int R=4;
		int C=5;
		for(int i=0; i<R; ++i)
	    {
	        /* Iterate over columns */
	        for(int j=0; j<C; ++j)
	        {
	            /* Print star for each column */
	            System.out.print("*");
	        }
	        
	        /* Move to the next line/row */
	        System.out.println();
	    }
		
		System.out.println();
		
		R=5;
		C=5;
		
		for(int i=0;i<R;++i)  
		   {  
		       for(int j=0;j<C-1;++j)  
		       {  
		    	   System.out.print(" ");
		       }  
		       for(int k=0;k<2*i-1;k++)  
		       {  
		    	   System.out.print("*"); 
		       }  
		       C--;  
		     
		       System.out.println();
		    }  
		
		System.out.println();
		
		
		R=4;
		int C1=5;
		int C2=5;
		for(int i=0; i<R; ++i)
	    {
	        /* Iterate over columns */
				for(int j=0; j<C1; ++j)
		        {
		            /* Print star for each column */
		            	System.out.print("*");
		            
		        }
			
	        for(int e=0;e<C2-1;++e)  
		       {  
		    	   System.out.print(" ");
		       }  
		       for(int k=0;k<2*i-1;k++)  
		       {  
		    	   System.out.print("*"); 
		       }  
		       C2--;  
	        
	        /* Move to the next line/row */
	        System.out.println();
	    }
		
		
		

	}

}
