// assignment: https://leetcode.com/problems/range-sum-query-immutable/     // date: 02 august 2021
class NumArray {
    public NumArray(int[] nums) 
    {
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
    }
    
    public int sumRange(int left, int right) 
    {
        if (left == 0)
        {
          return nums[right];
        }
      else
      {
        return nums[right] - nums[left - 1];
      }
    }
}
----------------------------------------------
  Accepted
Runtime: 3 ms
Your input
["NumArray","sumRange","sumRange","sumRange"]
[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]
Output
[null,1,-1,-3]
Expected
[null,1,-1,-3]
