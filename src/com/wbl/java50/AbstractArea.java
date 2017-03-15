package com.wbl.java50;

import java.lang.Math;

abstract class Shape
{
 abstract void area();
 double area,perimeter;
 int sides;
}


class Rectangle extends Shape
{
 double w=70,h=20;
 void area()
 {
  area = w*h;
  perimeter=2*(w+h);
  System.out.println("area of Rectangle -->"+area);
  System.out.println("perimeter of rectangle is" +perimeter);
 }
}

class Circle extends Shape
{
 double r=5;
 void area()
 {
  area = Math.PI * r * r;
  perimeter=2*Math.PI*r;
  System.out.println("area of Circle is" +area);
  System.out.println("perimeter of circle is" +perimeter);
 }
}

class AbstractArea
{
 public static void main(String [] args)
 {
  
  Rectangle r =new Rectangle();
  Circle c =new Circle();
  
 
  r.area();
  c.area();
 }
}
