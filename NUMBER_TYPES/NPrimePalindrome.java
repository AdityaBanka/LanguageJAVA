package NUMBER_TYPES;

import java.util.Scanner;
class NPrimePalindrome
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int s=0,i,n=2,k,p,d,c;
        int z = obj.nextInt();
        while(s!=z)
        {
            c=0;
            c=Factor_Count(n);
            if(c==2)
            { 
                p=n;
                k=0;
                while(p!=0)
                {
                    d=p%10;
                    k=k*10+d;
                    p=p/10;
                }
                if(k==n)
                {
                    System.out.println(n);
                    s++;
                }
            }
            n++;
        }
    }

    public static int Factor_Count(int a )
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if (a%i==0)
                c++;
        }
        return(c);
    }
}