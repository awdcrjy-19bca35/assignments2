
import java.util.*;
public class Main
{
  static int n = 100000;
  static int a[] = new int[n + 1];
  public static void seive ()
  {
    for (int i = 0; i <= n; i++)
    {
    a[i] = i;
    a[0] = 1;
    a[1] = 1;
    }
    for (int i = 2; i * i <= n; i++)
    {
	if (a[i] == i)
	  {
	    for (int j = i * i; j <= n; j = j + i)
	     {
	       a[j] = i;
	     }
	  }
    }

  }
  public static void main (String args[])
  {
    int f[] = new int[10000];
    int k = 0;
    seive ();
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter n value:");
    int n = sc.nextInt ();
    System.out.println("Number of prime factors of "+n+" are:");
   if(n<2)
   System.out.println("-1");
   else
   {
    while (n != 1)
      {
	   f[k] = a[n];
	   k++;
	   n /= a[n];
      }
    System.out.println(k);
   }
  }
}
-------------------------------------------------
  Enter n value:

225

Number of prime factors of 225 are:

4
  ------------------------------------------------------------
  Enter n value:

80

Number of prime factors of 80 are:

5






