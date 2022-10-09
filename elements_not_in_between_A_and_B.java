import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,count=0;
        a=sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++)
        {
           x[i]=sc.nextInt();
        }
        int c,d;
        c=sc.nextInt();
        d=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(x[i]<c||x[i]>d)
            {
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
        System.out.println("-1");
        
    }
}