// java program to find the next prime number to given n // date:31 july 2021
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Main
{
static int N=2000005;
public static int prime[]=new int[N];
public static int arr[]=new int[N];
public static void sieve()
{
for(int i=0;i<N;i++)
{
prime[i]=i;
}
prime[0]=1;
prime[1]=1;
for(int p=2;p*p<N;p++)
{
if(prime[p]==p)
{
for(int j=p*p;j<N;j=j+p)
{
prime[j]=p;
}
}
}
}
public static void main (String[] args) 
{
sieve();
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value: ");
int n=sc.nextInt();
System.out.println("Smallest prime number after "+n+" is: ");
for(int i=n;i<n*n;i++)
{
    if(prime[i]==i)
    {
        System.out.print(i);
        break;
    }
}
}
}
/*--------------
output:
Enter n value: 

81

Smallest prime number after 81 is: 

83

-----------------------
Enter n value: 

9

Smallest prime number after 9 is: 

11

