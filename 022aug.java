// java program to print sum of given number of even numbers  // date: 02 august 2021
import java.util.*;
import java.io.*;
class Main
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=1000;
int a[]=new int[n];
int p=1;
for(int i=1;i<n;i++)
{
if(i%2==0)
{
a[p]=i;
p++;
}
}
int pre[]=new int[n];
pre[0]=a[0];
for(int i=1;i<n;i++)
{
pre[i]=a[i]+pre[i-1];
}
System.out.println("Enter number of Queries: ");
int Q=sc.nextInt();
while(Q!=0)
{
System.out.println("Enter x value: ");    
int x=sc.nextInt();
System.out.println("Sum of "+x+" even numbers :"+pre[x]);
Q--;
}
}
}
-------------------------------------
Enter number of Queries: 

3

Enter x value: 

5

Sum of 5 even numbers :30

Enter x value: 

4

Sum of 4 even numbers :20

Enter x value: 

3

Sum of 3 even numbers :12




