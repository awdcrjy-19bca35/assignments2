import java.util.*;
class Bsort
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array size and elements");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("Before sorting");
show(a);
bubble(a,n);
System.out.println("After sorting");
show(a);
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
System.out.println();
}
static void bubble(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]<a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
}
---------------------------------------------------
output:
enter array size and elements
8
4 18 1 16 2 16 21 13
Before sorting 
4 18 1 16 2 16 21 13
After sorting 
21 18 16 16 13 4 2 1 
