package com.wbl.java50;


import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapExample {

   public static void main(String args[]) {

      
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      
      hmap.put(12, "silpa");
      hmap.put(2, "anu");
      hmap.put(7, "meera");
      hmap.put(49, "rohit");
      hmap.put(3, "sudha");

      
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

    

   }
}