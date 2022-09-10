import java.util.Scanner;
class perfect{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq;
        n=sc.nextInt();
        double d=Math.sqrt(n);
        if(d-(int)d>0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}