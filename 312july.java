// java program to print the largest prime number in given array // date: 31 july 2021
import java.util.*;
import java.lang.*;
class Main
{
static int N=2000000;
public static boolean prime[]=new boolean[N];
public static void sieve()
{
for(int i=0;i<N;i++)
{
prime[i]=true;
}
prime[0]=false;
prime[1]=false;
for(int p=2;p*p<N;p++)
{
if(prime[p]==true)
{
for(int j=p*p;j<N;j=j+p)
{
prime[j]=false;
}
}
}
}
public static boolean isPrime(int a)
{
    if(prime[a])
     { 
         return true;
     }
    else
    return false;
}
public static void main (String[] args) 
{
sieve();
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size: ");
int n=sc.nextInt();
System.out.println("Enter array elements: ");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
int max=-1;
for(int i=0;i<n;i++)
{
    if(isPrime(a[i]))
    {
       if(a[i]>max) 
       {
           max=a[i];
       }
    }
}
if(max==-1)
{
    System.out.println("No prime numbers found.");
}
else
{
System.out.println("Largest prime number is: "+max);
}
}
}

/*-------------------------------------------------------------
output:
Enter array size: 

5

Enter array elements: 

1 2 3 4 5

Largest prime number is: 5
-----------------------------------
Enter array size: 

10

Enter array elements: 

19 17 13 133 11  7 5 3 222 2

Largest prime number is: 19
---------------------------------------
Enter array size: 

4

Enter array elements: 

1 4 9 21

No prime numbers found.










