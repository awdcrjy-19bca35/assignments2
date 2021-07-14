// java program to check if a string is a substring of another string // date: 14 july 2021
import java.lang.*;
import java.util.*;
public class Strsubs
{
  public static void main(String[] arg)
  {
    Scanner p = new Scanner (System.in);
    System.out.println ("Enter your string: ");
    String str1 = p.nextLine ();
    System.out.println ("Enter string 2: ");
    String str2 = p.nextLine ();
    substr(str1,str2);     // method call
    if (substr(str1,str2))
      {System.out.println ("true");}
    else
      {System.out.println ("false");}
  }
  public static boolean substr(String str1, String str2) // method definition
  {
    for (int i=0;i<str1.length() ;i++)	
      {
	  for (int j=i + 1;j<=str1.length();j++)
	    {
	    if(str1.substring(i,j).equals(str2))
	      {return true;}
	    }
      }
    return false;
  }
}
/*------------------------------------------------------------------------
output:
Enter your string: 

incredible

Enter string 2: 

cred

true
--------------------
output 2:
Enter your string: 

array

Enter string 2: 

rays

false




