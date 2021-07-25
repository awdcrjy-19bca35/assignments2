// leet code assignment program 1 // date: 24 july 2021
class Solution {
    public int searchInsert(int[] nums, int target) {
       ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
          a.add(nums[i]);
        }
        if(a.contains(target))
        {
          return a.indexOf(target);
        }
        else
        {
         a.add(target);
         Collections.sort(a);
         return a.indexOf(target);
        } 
    }
}
/*-------------------------------
output:

Accepted
Runtime: 0 ms
Your input
[1,3,5,6]
5
Output
2
Expected
2
