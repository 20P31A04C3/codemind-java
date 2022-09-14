import java.util.Scanner;
class closestpal
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,temp=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,d1=0,d2=0,c,d;
        n=sc.nextInt();
        for(i=n-1;;i--)
        {
            if(ispalindrome(i))
            {
                d1=i;
                break;
            }
        }
        for(i=n+1;;i++)
        {
            if(ispalindrome(i))
            {
                d2=i;
                break;
            }
        }
        c=n-d1;
        d=d2-n;
        if(c==d)
        System.out.println(d1+" "+d2);
        else if(c<=d)
        System.out.println(d1);
        else
        System.out.println(d2);
    }
}