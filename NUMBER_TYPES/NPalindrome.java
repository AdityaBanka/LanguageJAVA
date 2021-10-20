package NUMBER_TYPES;

import java.util.Scanner;
class NPalindrome
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int c=0,n,z,p,k,d;
        z=obj.nextInt();
        for(n=1;c!=z;n++)
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
                c++;
                System.out.println(k);
            }
        }
    }
}