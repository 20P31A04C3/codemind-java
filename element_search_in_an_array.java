import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==k)
            {
                found=1;
                break;
            }
            else
            {
                found=0;
            }
        }
        if(found==1)
        System.out.println("True");
        else
        System.out.println("False");
        
        
        
        
    }
}