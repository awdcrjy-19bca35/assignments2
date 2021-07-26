// leetcode program https://leetcode.com/problems/count-primes/  // date: 26 july 2021
class Solution
{public int countPrimes(int n) 
 { int count=0;
   for(int i=1;i<n;i++)
    { int c=0;
	for(int j=1;j<=i/2;j++)
	 {
	   if(i%j==0)
           { c++; }
	  }
	  if(c==1)
	  count++;
    }   
      return count;  
    } //method
} //class
------------------- after running code: 
Accepted
Runtime: 0 ms
Your input
10
Output
4
Expected
4
-------------------- after code submission: 
Time Limit Exceeded
Details 
Last executed input
499979
Time Submitted    Status              Runtime       Memory   Language
07/26/2021 21:36  Time Limit Exceeded	N/A	     N/A     	java
