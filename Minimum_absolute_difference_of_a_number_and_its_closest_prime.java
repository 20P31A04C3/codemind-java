import java.util.Scanner;
class diff
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
           if(x%i==0)
           count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d1,d2;
        a=sc.nextInt();
        if(a==1)
        a=2;
        for(int i=a;;i++)
        {
            if(isprime(i))
            {
                d1=i;
                break;
            }
        }
        for(int i=a;;i--)
        {
            if(isprime(i))
            {
                d2=i;
                break;
            }
        }
        if((d1-a)<=(a-d2))
        System.out.println(d1-a);
        else
        System.out.println(a-d2);
    }
}