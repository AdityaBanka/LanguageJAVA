package NUMBER_TYPES;

import java.util.Scanner;
class DoEveryThingOnANumber
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int n,i,c,s,a,d;
        long p;
        n=obj.nextInt();
        if(n%2==0)
            System.out.println(n+" is a Even Number");
        else
            System.out.println("A Odd Number");
        c=0;
        s=0;
        p=1;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
                s=s+i;
                p=p*i;
            }
        }
        if(c==2)
            System.out.println(n+" is a PRIME Number");
        else
            System.out.println(n+" is NOT A PRIME Number");     
        System.out.println("Sum of the factors of "+n+" is "+s);
        System.out.println("Product of the factors of "+n+" is "+p);
        c=0;
        s=0;
        p=1;
        a=n;
        while(a!=0)
        {
            c++;
            d=a%10;
            s=s+d;
            p=p*d;
            a=a/10;
        }
        System.out.println("It is of "+c+" digits");
        System.out.println("Sum of its digits is "+s);
        System.out.println("Product of its digits is "+p);
    }
}
