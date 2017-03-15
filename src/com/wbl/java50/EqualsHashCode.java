package com.wbl.java50;

public class EqualsHashCode {
	 
    public static void main(String[] args) {
 
        EqualsHashCode test = new EqualsHashCode();
        obj a = new obj(1);
        obj b = new obj(1);
        test.equals(a, b);
 
        
    }
 
    public void equals(obj a, obj b) {
        if (a.equals(b)) {
            System.out.println("a and b are equal");
        } else {
            System.out.println(" a and b are not equal");
        }
    }
 
   
    }

 
class obj {
    private int value;
 
    obj(int val) {
        value = val;
    }
 
    public int getValue() {
        return value;
    }
 
    @Override
    public boolean equals(Object o) {
        if ((o instanceof obj) && (((obj) o).getValue() == this.value)) {
            return true;
        } else {
            return false;
        }
    }
 
    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (value / 11);
        return result;
    }
}