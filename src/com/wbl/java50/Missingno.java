package com.wbl.java50;

public class Missingno { 
	    	   
	 
	    public static void main(String[] args)
	    {
	        int n = 8;
	 
	        int[] a = {1, 4, 5, 3, 7, 8, 6};
	 
	        
	 
	        int sumOfnumbers = n*(n+1)/2;
	        int i;
	        int sum=0;
	        for(i=0;i<a.length;i++)
	        {
	        	sum=sum+a[i];
	        }	        
	        
	        int missingno = sumOfnumbers - sum;
	   	 
	        System.out.println("Missing Number is  "+missingno);
	    }
	}
	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        	
	 
	       
	 
	        
	 
	        
	 
	       

