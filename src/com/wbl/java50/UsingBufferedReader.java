package com.wbl.java50;

import java.io.*;
class UsingBufferedReader
{
public static void main(String args[])
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);
int val1=0;
int val2=0;
int diff; 
try
{
System.out.println("Enter First Number:");
val1=Integer.parseInt(br.readLine());
System.out.println("Enter Second Number:");
val2=Integer.parseInt(br.readLine());

}
catch(Exception e)
{
System.out.println("Error is:"+e);
}
diff=val1-val2;
System.out.println("difference of two Numbers is:"+diff);

}
}
