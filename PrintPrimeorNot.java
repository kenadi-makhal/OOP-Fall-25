
package com.mycompany.printprimeornot;

public class PrintPrimeorNot {

    public static void main(String[] args) {
        
        int num=10;
        int i;
        int result=0;
        
        if(num>1)
        {
            for(i=2; i<num; i++)
            {
                if(num%2==0)
                {
                    System.out.println(num+" is not a prime number");
                    break;
                }
                else
                {
                    System.out.println(num+" is a prime number");
                    break;
                }
            }
        }
    }
}
