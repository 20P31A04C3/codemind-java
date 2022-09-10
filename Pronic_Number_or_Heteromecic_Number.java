import java.util.Scanner;
class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,fact=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                fact=1;
                break;
                
            }
        }    
            if(fact==1)
            System.out.println("YES");
            else
            System.out.println("NO");
        
    }
}