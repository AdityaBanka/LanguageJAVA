package NUMBER_TYPES;
import java.util.Scanner;
class NAmicable
{
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);
        int no1,no2,a,b;
        System.out.println("Enter a range of number to be checked");
        System.out.println("Both numbers are included");
        int start=obj.nextInt();
        int end = obj.nextInt();
        for(no1=start;no1<=end;no1++)
        {
            for(no2=1;no2<=no1;no2++)
            {
                a=SumFactor(no1)-no1;
                b=SumFactor(no2)-no2;
                if(a==no2&&b==no1)
                    System.out.println("The pair of number is "+no1+" and "+no2);
            }
        }
    }
    public static int SumFactor(int a)
    {
        int s=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                s=s+i;
        }
        return(s);
    }
}