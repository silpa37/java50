package com.wbl.java50;

public class Fib {

	public static void main(String[] args)  
		 
		{    
	
	
		int n1=0;
		int n2=1;
		int j,n3;
		int count=5;
		System.out.print(n1 +" "+n2);
		for(j=2;j<count;++j)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
			
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	


