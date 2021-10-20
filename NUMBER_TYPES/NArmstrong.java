package NUMBER_TYPES;

import java.util.Scanner;
class NArmstrong
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int i=1,p,s,d,n,c=0;
        n=obj.nextInt();
        while(c!=n)
        {
            p=i;
            s=0;
            while(p!=0)
            { 
                d=p%10;
                s=s+(d*d*d);
                p=p/10;
            }
            if(s==i)
            {
                System.out.println(i);
                c++;
            }
            i++;  
        }
    }
}