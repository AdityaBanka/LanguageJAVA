package NUMBER_TYPES;

import java.util.Scanner;
class NMagic
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int c=0,i=1,d,s=0,n,p=0;
        n=obj.nextInt();
        while(c!=n)
        {
            p=i;
            while(p>9)
            {
                s=0;
                while(p!=0)
                {
                    d=p%10;
                    s=s+d;
                    p=p/10;
                }
                p=s;
            }
            if(p==1)
            {
                System.out.println(i);
                c++;
            }
            i++;
        }
    }
}