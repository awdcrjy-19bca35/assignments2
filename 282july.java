// java program to print prime numbers in reverse order using sieve method / date:28 july 2021
import java.util.*;
class Main {
    static int q=500000;
    static boolean prime[]=new boolean[q+1];
    static void sieve(int n)
    {
        for(int i=0;i<=n;i++)
        {
        prime[i]=true;
        prime[0]=false;
        prime[1]=false;
        }
        for(int a=2;a*a<=n;a++)
        {
            if(prime[a]==true)
            {
                for(int i=a*a;i<=n;i+=a)
                {
                    prime[i]=false;
                }
            }
        }
        System.out.println("Prime numbers between "+n+" and 1 are:");
        for(int i=n;i>=2;i--)
        {
            if(prime[i]==true)
            {
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        sieve(n);
    }
}

-----------------------------------
Enter n value:

50

Prime numbers between 50 and 1 are:

 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2

