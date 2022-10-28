import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int c[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                c[i][j]=sc.nextInt();
                sum=sum+c[i][j];
            }
        }
        System.out.print(sum);
    }
}