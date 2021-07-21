// java program to check if number of odd and even elements is equal in the stack // date: 20n july 2021
import java.util.*;
public class Main
{ public static void main (String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter array size and elements: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i=0;i<n;i++)
     {
         a[i] = sc.nextInt ();
     }
    stackbal(a);
  }
  public static void stackbal(int a[])
  {
    Stack <Integer> sta = new Stack <Integer>();
    for (int i = 0; i < a.length; i++)
     {
        sta.push (a[i]);
     }
    int odd = 0, even = 0;
    for (int i:sta)
      {
	     if (i%2==0)
	     even++;
	     else
	     odd++;
      }
    if (odd==even)
     {
        System.out.println ("Stack balanced.");
     }
    else
      {
        System.out.println ("Stack is not balanced.");
      }
  }
}
/* output:
Enter array size and elements: 

5

2 3 4 56 6

Stack is not balanced.
-------------
output 2:
Enter array size and elements: 

6 

6 5 4 3 2 1

Stack balanced.






