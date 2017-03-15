package com.wbl.java50;

public class StaticDemo {
	 
    static {
        System.out.println("This is a static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
    }
     
    public StaticDemo(){
        System.out.println("This is a constructor");
    }
     
    public static void main(String a[]){
        StaticDemo ksv1 = new StaticDemo();
        
    }
}
