package NUMBER_TYPES;
import java.util.Scanner;
class goldbachsExperimental
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int n,m,c,i,p1=0,p2=0;
        i=obj.nextInt();
        for(n=2;n<=(i/2);n++)
        {
            c=0;
            c=FactorCount(n);
            if(c==2)
            {
                p1=n;
                for(m=n;m<i;m++)
                {
                    c=0;
                    c=FactorCount(m);
                    if(c==2)
                    {
                        p2=m;
                        if(p1+p2==i)
                            System.out.println(p1+" + "+p2+" = "+i);
                    }
                }
            }
        }
    }
    public static int FactorCount(int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
            if(a%i==0)
            c++;
        return(c);  
    }
}