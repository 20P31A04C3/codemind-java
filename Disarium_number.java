import java.util.Scanner;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp=0,sum=0,rem=0;
        a=sc.nextInt();
        temp=a;
        b=(int)Math.log10(a)+1;
        while(a>0)
        {
            rem=a%10;
            sum=sum+(int)Math.pow(rem,b);
            b--;
            a=a/10;
        }
        if(temp==sum)
        System.out.println("True");
        else
        System.out.println("False");
    }
}