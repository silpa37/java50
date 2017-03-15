package com.wbl.java50;

public class Swap {

	public static void main(String[] args) {
		
		
		swap(5, 7);
		swap1(10,20);
		
		
		

	}
	
	public static void swap(int a,int b)
	{
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a is" +a);
		System.out.println("value of b is"  +b);
		
	}
	public static void swap1(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x is:" +x);
		System.out.println("value of y is:" +y);
		
		
				
		
	}


}
