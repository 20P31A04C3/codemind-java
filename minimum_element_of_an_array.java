import java.util.Scanner;
import java.util.Arrays;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,min=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[0]);
        
    }
}