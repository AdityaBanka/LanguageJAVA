package NUMBER_TYPES;

import java.util.Scanner;
class NPrimeReverse
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int s=0,i,n=2,k,p,d,c;
        int z = obj.nextInt();
        while(s!=z)
        {
            c=0;
            for(i=1;i<=n;i++)
                if(n%i==0)
                    c++;
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
                c=0;
                for(i=1;i<=k;i++)
                    if(k%i==0)
                        c++;
                if(c==2)
                {
                    System.out.println(n);
                    s++;
                }
            }
            n++;
        }
    }
}