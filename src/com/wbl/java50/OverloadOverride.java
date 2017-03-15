package com.wbl.java50;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}

class Sum
{
void add(int a, int b)
{
            System.out.println("Sum of two="+(a+b));
}

void add(int a, int b,int c)
{
            System.out.println("Sum of three="+(a+b+c));
}
}
class OverloadOverride
{
      public static void main(String args[])
      {
            Sum s=new Sum();
            s.add(10,15);
            s.add(10,20,30); 
            Animal b=new Dog();
            b.move();
      }
    }

