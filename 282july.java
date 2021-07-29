// java program to print n prime numbers in reverse order // date: 28 july 2021
import java.util.*;
public class Main
{   static int n=1000000;
    static int a[]=new int[n];
    public static void sieve() 
    {
        for(int i=0;i<n;i++)
        {
            a[i]=1;
        }
        for(int i=2;i*i<n;i++)
        {
         if(a[i]==1)
         {
            for(int j=i*i;j<n;j=j+i)
                a[j]=0;
         }
        }
    }
	public static void main(String[] args) {
	  sieve();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value: ");
		int N=sc.nextInt();
		int k=0;
		int p[]=new int[N];
		for(int i=2;k<N;i++)
		{
		    if(a[i]==1)
        { 
          p[k]=i;    
		      k++;
        }
		}
		System.out.println(N+" Prime numbers in reverse order are: ");
		for(int i=N-1;i>=0;i--)
		{
		System.out.print(p[i]+" ");
		}
	}
}
----------------------------------------------------
  output:
Enter N value: 

10

10 Prime numbers in reverse order are: 

29 23 19 17 13 11 7 5 3 2 
-----------------------------------------------------
  Enter N value: 

50

50 Prime numbers in reverse order are: 

229 227 223 211 199 197 193 191 181 179 173 167 163 157 151 149 139 137 131 127 113 109 107 103 101 97 89 83 79 73 71 67 61 59 53 47 43 41 37 31 29 23 19 17 13 11 7 5 3 2 


