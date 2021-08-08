https://leetcode.com/problems/counting-bits/submissions/
class Solution {
    public int[] countBits(int n)
    {
        int[] ans = new int[n+1];
        for(int i=1;i<= n ;i++){
        ans[i] = ans[i&(i-1)] +1;
    }
return ans;
    }
}
-----------------------------------------
output:
Accepted
Runtime: 0 ms
Your input
2
Output
[0,1,1]
Expected
[0,1,1]
