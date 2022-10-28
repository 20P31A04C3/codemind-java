import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            d[i]=a[i]+b[i];
        }
        for(int i=0;i<n;i++)
        System.out.print(d[i]+" ");
        
        
       
    }
}