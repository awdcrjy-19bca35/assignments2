// leetcode problem https://leetcode.com/problems/factorial-trailing-zeroes/submissions/ // date: 26 july 2021 
class Solution {
    public int trailingZeroes(int n) {
        long fact=1,r;                 // identified that the range of int is not sufficient to store factorial values, so updated fact to long 
        int count=0;
        for(int i=1; i<=n;i++)
        {
            fact=fact*i;
        }
        while(fact>0)
        {
         r=fact%10;
         fact=fact/10;
            if(r==0)
            {
                count++;
            }
            if (r!=0)
            break;
        }
      return count;  
    }
}
-------------------------after running code
Accepted
Runtime: 0 ms
Your input
3
Output
0
Expected
0
------------------------after submission       // identified that long data type isn't sufficient either // might be a space complexity problem.
Wrong Answer
Details 
Input
30
Output
0
Expected
7
Time Submitted    Status        Runtime  Memory Language
07/26/2021 22:35	Wrong Answer	N/A	     N/A	   java
