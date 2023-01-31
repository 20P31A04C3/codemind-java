import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,large=0,rem;
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            if(large<rem)
            {
                large=rem;
            }
            n=n/10;
        }
        System.out.print(large);
        
    }
}