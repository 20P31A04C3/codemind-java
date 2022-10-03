import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,res=0;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        res=(p*t*r)/100;
        System.out.println(res);
    }
}