package NUMBER_TYPES;

import java.util.Scanner;
class NFibonacci
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        long a=0,b=1,c=0,n=obj.nextInt();
        while(c!=n)
        {
            System.out.println(a);
            System.out.println(b);
            a=a+b;
            b=a+b;
            c=c+2;
        }
    }
}