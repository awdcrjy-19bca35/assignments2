// leet code problem (using sieve method) https://leetcode.com/problems/count-primes/submissions/  // date: 27 july 2021
class Solution {
public int countPrimes(int n) 
{
  boolean prime[]=new boolean[n];
  for(int i=0;i<n;i++)
  { prime[i]=true; }
  for(int i=2;i*i<n;i++)
	  {
      if (prime[i]==true)
        {
          for(int j=i*i;j<n;j=j+i)
            {
             prime[j]=false;
            } //ifor
        }//if
     }//for
     
  int count=0;   
	for(int i=2;i<n;i++)
  {
	 if(prime[i]==true)
    count++;
	 }
   return count;  
} 
}
---------------------------------------------after running:
Accepted
Runtime: 0 ms
Your input
10
Output
4
Expected
4
---------------------------------------------after submission:
Time Submitted    Status    Runtime    Memory   Language
07/27/2021 19:41	Accepted	33 ms	     42.2 MB	java
  
