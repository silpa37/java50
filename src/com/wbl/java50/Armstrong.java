package com.wbl.java50;

public class Armstrong {

	public static void main(String[] args) {
		int n=123,a,res=0;
		int temp=n;
		while(n>0){
			
		a=n%10;
		res=res+(a*a*a);
		n=n/10;
			
		}
		if(temp==res)
		{
			System.out.println("n is an armstrong number");
			
		}
		else
			System.out.println("n is not an armstrong number");

	}

}
