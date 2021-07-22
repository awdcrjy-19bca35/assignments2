// leet code program - https://leetcode.com/problems/first-unique-character-in-a-string/  // date: 22 july 2021

import java.util.*;
public class Main
{ public static int nonrep(String str)
{   
      for(int i = 0; i < str.length(); i++) 
      {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)) 
            {
                return i;
            }
            
        }
     return -1;      
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.nextLine();
		int ans=nonrep(str);
		System.out.println(ans);
	}
}


/*------------------------------------
output:
Enter your string:

hi

0
-----------------
Enter your string:

hehe

-1







