import java.util.*;
class Ssort
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
selection(a,n);
System.out.println("After sorting");
show(a);
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
System.out.println();
}
public static void selection(int a[],int n)
{
int m;
for(int i=0;i<n-1;i++)
{
m=i;
for(int j=i+1;j<n;j++)
{
if(a[j]>a[m])
m=j;
}
if(m!=i)
{
int t=a[i];
a[i]=a[m];
a[m]=t;
}
}
}
}
----------------------------------------------
output:
enter array size and elements
8
45 8 14 1 52 16 2 10
Before sorting
45 8 14 1 52 16 2 10
After sorting
52 45 16 14 10 8 2 1
