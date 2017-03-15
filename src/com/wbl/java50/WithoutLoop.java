package com.wbl.java50;

public class WithoutLoop 
{
	
	public  void  recursion(int i)
	{
		
		if(i<=10)
		{
			System.out.println(i);
			recursion(i+1);
			
		}
		
	}
	
	public static void main(String args[])
	{
		WithoutLoop obj=new WithoutLoop();
		obj.recursion(1);
		
		
		
	}
		
		}