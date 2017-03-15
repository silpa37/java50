package com.wbl.java50;

public class Fact1 {

	public static void main(String[] args) {
		Fact1 f=new Fact1();
		int a=f.fact(5);
		System.out.println(a);
		
		

	}
	
	
	public int fact(int n)
	{
		int res=1;
		if(n==1)
			return 1;
		res=fact(n-1)*n;
		return res;
	}
	
	
	

}
