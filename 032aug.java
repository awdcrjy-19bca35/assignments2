// java program to print factorial using prefix multiplication // date: 03 august 2021
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner p = new Scanner(System.in);
    int n =15;
    int arr[]=new int[n];
    arr[1]=1;
    for(int i=2;i<n;i++)
    {
        arr[i]=i*arr[i-1];
    }
    System.out.println("Enter value: ");
    int x=p.nextInt();
    System.out.println("Factorial of "+x+" is: "+arr[x]);
  }  
}
------------------------------------
  output:
Enter value: 

4

Factorial of 4 is: 24
-----------------------
  Enter value: 

13

Factorial of 13 is: 1932053504






