package com.wbl.java50;

import java.util.ArrayList;

public class ArraylistToArray {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("silpa");
        arrl.add("rajesh");
        arrl.add("rekha");
        arrl.add("siri");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}
