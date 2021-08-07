import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n value:");
    int n = sc.nextInt ();
    int p[] = new int[n];
    
      System.out.println("Enter how many times we have to perform add operation: ");
      int m=sc.nextInt();
      while(m>0)
      {
          System.out.println("Enter a and b values: ");
          int a=sc.nextInt();
          int b=sc.nextInt();
          for(int i=a-1;i<=b-1;i++)
          {
            p[i]+=100;  
          }
          m--;
      }
      Arrays.sort(p);
      System.out.println("Highest element in the array is :"+p[n-1]);
  }
}
-----------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter n value:

6

Enter how many times we have to perform add operation: 

2

Enter a and b values: 

5

1

Enter a and b values: 

2

3

Highest element in the array is :100



