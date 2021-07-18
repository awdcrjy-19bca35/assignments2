// java program to print the missing positive integer in a given unsorted array // date: 17 july 2021
import java.util.*;
public class Main
{ public static int firstMissingPositive(int[] nums) 
      {
        Arrays.sort(nums);
        int ans = 1;
        for (int i : nums) 
        {
            if (i > 0)
            {
                if (ans < i) 
                {
                    return ans;
                } 
                else if (ans == i) 
                {
                    ans++;
                }
            }
        }
     return ans;
    }

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size and elements");
		int n = sc.nextInt ();
		int nums[] = new int[n];
        for (int i = 0; i < n; i++)
         {
             nums[i] = sc.nextInt ();
         }
        int answer=firstMissingPositive(nums);
        System.out.println("Missing integer :"+answer);
	}
}

/*-----------------------------------------
output:
Enter array size and elements

4

-1 0 2 3

Missing integer :1
----------------------------------------
output:
Enter array size and elements

7

1 8 5 6 2 3 7 9

Missing integer :4








