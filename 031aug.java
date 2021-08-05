import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n value and elements:");
    int n = sc.nextInt ();
    int p[] = new int[n];
    for (int i = 0; i < n; i++)
     {
         p[i] = sc.nextInt ();
     }
    for (int i = 1; i < n; i++)
     {
         p[i] = p[i - 1] + p[i];
     }
    System.out.println ("Enter range as l and r values: ");
    int l = sc.nextInt ();
    int r = sc.nextInt ();
    System.out.println ("Sum of elements in the given range is : " +(p[r] - p[l - 1]));
    System.out.println("Enter the range where we should add value: ");
    int a = sc.nextInt ();
    int b = sc.nextInt ();
    System.out.println ("Enter the value to be added: ");
    int x = sc.nextInt ();
    int j = 0;
    for (int i = a; i <= b; i++)
      {
	   j++;
	   p[i] = p[i] + j * x;
      }
    for (int i = b + 1; i < n; i++)
     {
         p[i] = p[i] + (i - a) * x;
     }

    System.out.println ("Sum of values in range after updating: " +(p[r] - p[l - 1]));
  }
}
------------------------
output:
Enter n value and elements:

9

10 2 75 12 23 7 8 45 7

Enter range as l and r values: 

2 8

Sum of elements in the given range is : 177

Enter the range where we should add value: 

1 4

Enter the value to be added: 

15

Sum of values in range after updating: 267



