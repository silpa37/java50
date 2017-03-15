package com.wbl.java50;


	import java.io.DataInputStream;
	class UsingDataInputStream
	{
	public static void main(String args[])
	{

	DataInputStream in = new DataInputStream(System.in);
	int a=0;
	int b=0;
	try

	{
	System.out.print("enter the value of a");

	a=Integer.parseInt(in.readLine());
	System.out.print("enter the value of  b");
	b=Integer.parseInt(in.readLine());


	}
	catch (Exception e) { }
	int mult;
	mult=a*b;
	System.out.println("sum of a and b variable is="+mult);
	}
	}


