import java.util.Scanner;
class Array3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],i,n,k,count=0;
n=sc.nextInt();
x=new int[n];
k=sc.nextInt();
//reading an array elements
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
//print the elements of an array
for(i=0;i<n;i++)
{
if(x[i]%k!=0)
count++;
}
System.out.print(count);
}
}
