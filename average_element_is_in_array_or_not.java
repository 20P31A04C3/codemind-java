import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        float average =(int)sum/n;
        for(i=0;i<n;i++)
        {
            if(average==x[i])
            {
            System.out.println("True");
            System.exit(0);
            }
            
        }
        System.out.println("False");
        
    }
}