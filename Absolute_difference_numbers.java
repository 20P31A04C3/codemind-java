import java.util.Scanner;
class abs
{
    public static void main(String args[])
    {
        int a,b,d1,d2,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(int)Math.log10(a)+1;
        d1=a%(int)Math.pow(10,b);
        d2=a/(int)Math.pow(10,(c-b));
        System.out.println(Math.abs(d1-d2));
    }
}