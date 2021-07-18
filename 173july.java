// java program to check if the given array contains duplicate elements // date: 17 july 2021
import java.util.*;
public class Main
{
  public static boolean repeatedelement (int a[])            
   {
    Set < Integer > s = new HashSet < Integer >();
    for (int i: a)
    {
	  if (s.add(i) == false)
	   {
	     return true;
	   }
   }
    return false;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter array size and elements:");
    int n = sc.nextInt ();
    int a[] = new int[n];
    for (int i = 0; i < n; i++)
     {
      a[i] = sc.nextInt ();
     }
    boolean ans= repeatedelement (a);
    System.out.println(ans);
  }
}
/*------------------------------------------------------
output:
Enter array size and elements:

5

11 2 11 4 5

true
------------------------
output:
Enter array size and elements:

8

10 11 12 131 142 153 167 0

false



