// prints the prime number before the given n value // notes date: 31 july 2021
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
System.out.println("Largest prime number before "+n+" is: ");
for(int i=n;i>=2;i--)
{
    if(prime[i]==i)
    {
        System.out.print(i);
        break;
    }
}
}
}
// op:
Enter n value: 

18

Largest prime number before 18 is: 

17

--
  Enter n value: 

23

Largest prime number before 23 is: 

23


