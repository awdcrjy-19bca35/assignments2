// java program to print odd mumbers at odd array index and even numbers at even array index // date: 15 july 2021
import java.util.*;
import java.lang.*;
class Main {
    public static  int[] sortArrayByParityII(int[] nums) {
        ArrayList <Integer> even=new ArrayList<Integer>();
        ArrayList <Integer> odd=new ArrayList<Integer>();  
        for(int i=0;i<nums.length;i++)
        {
         if(nums[i]%2==0)
         {even.add(nums[i]);}
        else
        { odd.add(nums[i]);}
        }
            int i=0;
            for(Integer val:even)
            {
                nums[i]=val;
                i+=2;
            }
            i=1;
            for(Integer val:odd)
            {
                nums[i]=val;
                i+=2;
            }
            
      return nums;
    }
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size and elements:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i]=sc.nextInt();
        }
        int ans[]=sortArrayByParityII(nums);
        for(int i=0; i<n ; i++)
        {
        System.out.print(" "+ans[i]);
        }
    } 
}
/*-----------------------------------------------------
output:
Enter your array size and elements:

4

1 7 4 2

 4 1 2 7
 -----------------------------------
 output:
 Enter your array size and elements:

6

6 1 5 2 3 4

 6 1 2 5 4 3



