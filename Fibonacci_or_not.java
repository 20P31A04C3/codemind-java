import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,found=0;
        n=sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                found=1;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(found==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}