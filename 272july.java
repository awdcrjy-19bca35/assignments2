// java program https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/sum-of-primes-7/ // date: 27 july 2021
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    static int n=500000;
    static boolean prime[]=new boolean[n+1];
    static void sieve(int n)
    {
        for(int i=0;i<=n;i++)
        {prime[i]=true;
        prime[0]=false;
        prime[1]=false;}
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
    }
    public static void main(String args[] ) throws Exception {
        sieve(n);
        int t;
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(buff.readLine());
        while(t>0)
        {
            int l,r;
            int sum=0;
            String str[]=buff.readLine().trim().split("\\s+");
            l=Integer.parseInt(str[0]);
            r=Integer.parseInt(str[1]);
            for(int i=l;i<=r;i++)
            {
                if(prime[i]==true)
                sum=sum+i;
            }
            System.out.println(sum);
            sum=0;
            t--;
            
        }
    }   

}
----------------------------------------------- after running:
  RESULT: Sample Test Cases Passed Refer judge environment
Time (sec)     Memory (KiB)     Language

0.084939       3430976           Java 14
Input
2
1 6
4 13
Output
10
36
Expected Correct Output
10
36
----------------------------------
after running in java compiler:
3                 // t

3 10              // l r  for t=3

15                // sum

1 10              // l r for t=2 

17                // sum

5 20              // l r  for t=1

72                // sum
