import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=sc.nextInt();
        int i=1;
        while(i<=r)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
            i=i+2;
        }
    }
}