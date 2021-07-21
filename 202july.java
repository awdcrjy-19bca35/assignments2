//program to remove odd elements from stack // date: 20 july 2021
import java.util.*;
public class Main
{ public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter array size and elements : ");
    int n = sc.nextInt ();
    int a[] = new int[n];
    for (int i=0;i<n;i++)
    {
    a[i] = sc.nextInt ();
    }
    removeodd(a);
  }
  public static void removeodd(int a[])
  {
    Stack <Integer> sta = new Stack <Integer> ();
    Stack <Integer> sta2 = new Stack <Integer> ();
    for (int i = 0;i<a.length;i++)
     {
         sta.push(a[i]);
     }
    while (sta.isEmpty() == false)
      {
	     int e = sta.peek ();
	     if (e % 2 == 0)
	     {
	      sta2.push (e);
	     }
	     sta.pop();
      }
    System.out.println("Stack after odd numbers are removed: ");
    for(int i:sta2)
     {
         System.out.print (i+" ");
     }

  }
}

/* output:
Enter array size and elements : 

5

1 2 3 4 5

Stack after odd numbers are removed: 

4 2 

