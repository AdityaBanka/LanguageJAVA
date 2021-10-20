package NUMBER_TYPES;
import java . util.Scanner;
class Value_of_K
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        double a,b,c,d,n,k;
        n=obj.nextInt();
        for( c=1.0;c<=n;c++)
        {
            a=2.0*c;
            b=3/2.0*c;
            d=a+b*1.0;
            k=FindValue(a,b,c,d);
            System.out.println("The value of k according to the given formula is "+k);
        }
    }
    public static double FindValue( double a,double b,double c,double d)
    {
        double p1,p2,p3,k;
        p1=(6.0*a*a*a)/(3.0*b*b*b);
        p2=(4.0*c*c)/(1.4*d);
        p3=(2.0*a)/(7.0*b);
        k=p1+p2+p3;
        return(k);
    }
}