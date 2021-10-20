package NUMBER_TYPES;

import java.util.Scanner;
class NSpecial
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int c=0,j,i=10000,s;
        int n=obj.nextInt();
        while (c!=n)
        {
            s=0;
            for(j=1;j<=(i/2);j++)
            {
                if(i%j==0)
                    s=s+j;
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