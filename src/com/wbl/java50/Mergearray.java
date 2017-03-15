package com.wbl.java50;

public class Mergearray {

	public static void main(String[] args) {
		int a[]={3,5,6,1,9};
		int b[]={5,3,8,9,3,0,7};
		int c[]=new int[a.length+b.length];
		
		int i,j,index=0;
		
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
			index++;
		}
		for(j=0;j<b.length;j++)
		{
			c[index++]=b[j];
		}
		
				
				for(i=0;i<c.length;i++)
				{
					System.out.print(c[i]+" ");
				}
				
				
		}

	}



