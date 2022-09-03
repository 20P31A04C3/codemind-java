import java.util.Scanner;
class palindrome
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            if(ispalindrome(i))
            {
                System.out.print(i+" ");
            }    
                
        }
    }
}