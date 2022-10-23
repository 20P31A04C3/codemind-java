import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(b[i]==0)
                System.out.print("0 ");
        }
        for(int i=0;i<a;i++)
        {
            if(b[i]==1)
            System.out.print("1 ");
        }
    }
}