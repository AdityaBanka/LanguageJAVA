package NUMBER_TYPES;

import java.util.Scanner;
class Monkey_Island         //Code by CoderBoiNeo
{
    public static void main (String args[])
    {
        Scanner obj=new Scanner (System.in);
        int c=0,z=0,a=0,x=0;
        System.out.println("Enter the number of sailors who went to the Island");
        int n=obj.nextInt();
        while(c!=n+1)
        {
            c=0;
            z++;
            for(x=z; x%n==1; x=x-(a+1))
            {
               a=(x-1)/n;
               c++;
            }
            if(c==n+1)
            System.out.println("The number of coconut collected is "+z);
        }
    }
}