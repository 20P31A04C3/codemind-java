import java.util.Scanner;
class neonnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b,r=0,sq=1,sum=0;
        n=sc.nextInt();
        b=n*n;
        while(b>0)
        {
            r=b%10;
            sum=sum+r;
            b=b/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        System.out.println("Not Neon Number");
    }
}