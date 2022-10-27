import java.util.Scanner;
class java1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        b[i]=sc.nextInt();
        for(int i=a-1;i>=a/2;i--)
        System.out.print(b[i]+" ");
        for(int i=0;i<a/2;i++)
        System.out.print(b[i]+" ");
    }
}