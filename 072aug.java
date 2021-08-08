https://leetcode.com/problems/power-of-two/submissions/
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n % 2==1) return false;
        
        return isPowerOfTwo(n/2);    
    }
}
-----------------------------------
output:
Accepted
Runtime: 0 ms
Your input
1
Output
true
Expected
true
