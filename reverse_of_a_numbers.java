import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rem=0,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            rem=rem*10+r;
            n=n/10;
        }
        System.out.println(rem);
        
    }
}