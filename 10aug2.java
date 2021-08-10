// program for insertion sort // 10 aug 2021
import java.util.*;
class Insort
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter array size and elements: ");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
show(a);
insertion(a,n);
show(a);
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
System.out.println();
}
static void insertion(int a[],int n)
{
for(int i=1;i<n;i++)
{
int t=a[i];
int j=i-1;
while(j>=0&&a[j]>t)
{
a[j+1]=a[j];
j--;
}
a[j+1]=t;
}
}
}
--------------------------------------------------
output:
Enter array size and elements: 

7

4 12 3 8 1 2 89

4 12 3 8 1 2 89 

1 2 3 4 8 12 89 



