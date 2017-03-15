package com.wbl.java50;

class Nullpointer
{
    public static void main (String[] args)
    {
        
        String ptr = null;
 
       
        try
        {
          
            if (ptr.equals("cat"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
       catch(NullPointerException e)
        {
            System.out.println("Exception handled");
        }
        finally
        {
        	System.out.println("Executing the finally block");
        }
    }
}
