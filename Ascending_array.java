import java.util.Scanner;
class descendingorder
{
  public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         int x[],i,a;
		 a=sc.nextInt();
         x=new int[a];
         for(i=0;i<a;i++)
           {
             x[i]=sc.nextInt();
           }
         for(i=0;i<a-1;i++)
         {
             if(x[i]>=x[i+1])
              {
                 System.out.println("no");
                 System.exit(0);    
              }
         }
		 System.out.println("yes");
     }
}