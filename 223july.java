// java program // date: 22 july 2021
import java.util.*;
public class Main
{ public static boolean balanced(String str)
 {    Stack <Character> sta=new Stack<Character>();
     if((str==null) || (str.length()%2!=0))
     {return false;}
     for(int i=0;i<str.length();i++)
     {
         char ch=str.charAt(i);
         if( (ch=='(')||(ch=='[')||(ch=='{'))
         {
             sta.push(ch);
         }
         else
         {
            if( (ch==')')||(ch==']')||(ch=='}'))
            {
                if(!sta.empty())
                {
                    char p=sta.pop();
                    if(p=='{'&& p!='}')
                    return false;
                    if(p=='['&& p!=']')
                    return false;
                    if(p=='('&& p!=')')
                    return false;
                }
                else 
                    return false;
               
            }
             
         }
     }
     return sta.empty();
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.nextLine();
		boolean ans= balanced(str);
		if(ans)
		{
		    System.out.println("Balanced.");
		}
		else
		{
		   System.out.println("Not Balanced."); 
		}
	}
}
----------------------------------------------------
  /* output:
  Enter your string:

()

Balanced.
--------------------
Enter your string:

()}

Not Balanced.







