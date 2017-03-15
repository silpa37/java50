package com.wbl.java50;

import java.util.HashSet;

public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"ram", "sam", "jam", "ram", "dam", "pam", "sam"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
}