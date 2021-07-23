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
/*  using stack methods
class Solution {
    public int firstUniqChar(String s) {
       Stack<Character> sta=new Stack<Character>();
       Stack<Character> sta1=new Stack<Character>();
       Stack<Character> sta3=new Stack<Character>();

        sta.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            while(sta.empty()==false)
            {
                if(sta.peek()==s.charAt(i))
                {   sta3.push(sta.peek());
                    sta.pop();

                    break;
                }
                else
                {
                   sta1.push(st.peek());
                    sta.pop();

                }
            }

            if(sta3.contains(s.charAt(i))==false)
            sta.push(s.charAt(i));
            sta.addAll(sta1);
            sta1.clear();
        }
        if(sta.empty())
            return -1;
        int e=sta.peek();
        sta.pop();
        while(!sta.empty())
        {
        if(s.indexOf(sta.peek())<s.indexOf(e))
        e=sta.peek();
        sta.pop();
        }


        return s.indexOf(e);
    }
} 
*/

/*------------------------------------
output:
Enter your string:

hi

0
-----------------
Enter your string:

hehe

-1







