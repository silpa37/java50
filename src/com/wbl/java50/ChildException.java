package com.wbl.java50;

import java.io.*;
class Parent {  
   void color() throws IOException
   {
       System.out.println("Blue");
   } 
}
class ChildException extends Parent{
    void color() throws IOException
    {
        System.out.println("White");
    }  
    public static void main(String args[]){  
        ChildException obj = new ChildException();  
        try{
	   obj.color();
	}catch(Exception e){
	   System.out.println(e);
	 }
    } 
}