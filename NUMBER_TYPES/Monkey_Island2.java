package NUMBER_TYPES;
import java.util.Scanner;
class Monkey_Island2
{
    public static void main (String args[])
    {
        Scanner obj=new Scanner (System.in);
        int c=0,z=0,a=0,x=0;
        System.out.println("Enter the number of sailors who went to the Island");
        int n=obj.nextInt();
        while(c!=n+1)
        {
            c=0;
            z++;
            x=z;
            for(int i=1;i<=n+1;i++)
            {
                if(x%n==1)
                {
                    a=(x-1)/n;
                    x=x-a-1;
                    c++;
                }
            }
            if(c==n+1)
                System.out.println("The number of coconut collected is "+z);
        }
    }
}