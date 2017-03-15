package com.wbl.java50;

public class GarbageDemo{

public static void main(String [] args) {
StringBuffer greet = new StringBuffer("hello");
System.out.println(greet);
greet = null;
}
}