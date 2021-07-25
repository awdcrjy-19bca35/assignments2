// java program to find the insertion of 2 arrays // date: 24 july 2021
import java.util.*;
class Main
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter array1 and array2 size: ");
int n=s.nextInt();
int m=s.nextInt();
int a[]=new int[n];
int b[]=new int[m];
System.out.println("Enter array1 elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter array2 elements:");
for(int j=0;j<m;j++)
{
b[j]=s.nextInt();
}
System.out.println("Insertion of array 1 and array 2 is: ");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(a[i]==b[j])
System.out.print(" "+a[i]);
}
}
}
}
/*------------------------------------
output:
Enter array1 and array2 size: 

6 8

Enter array1 elements:

6 5 4 3 2 1

Enter array2 elements:

8 7 6 5 4 0 9 1

Insertion of array 1 and array 2 is: 

 6 5 4 1
