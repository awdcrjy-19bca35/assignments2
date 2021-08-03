import java.util.*;
import java.io.*;
class Main
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=1000;
int a[]=new int[n];
int k=1;
for(int i=1;i<n;i++)
{
if(i%2==0)
{
a[k]=i;
k++;
}
}
int pre[]=new int[n];
pre[0]=a[0];
for(int i=1;i<n;i++)
{
pre[i]=a[i]+pre[i-1];
}
int t=sc.nextInt();
while(t!=0)
{
int n1=sc.nextInt();
System.out.println(pre[n1]);
t--;
}
}
}
-------------------------------------
output:
3
4
20
10
110
20
420
