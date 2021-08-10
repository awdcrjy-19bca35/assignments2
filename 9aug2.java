import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter array size and elements: ");
    int n = sc.nextInt ();
    int ar[] = new int[n];
    for (int i = 0; i < n; i++)
        ar[i] = sc.nextInt ();
      System.out.println ("Enter search element");
    int ele = sc.nextInt ();
    int l=0,h=n-1,c=-1;
    while(l<=h)
    {
    int mid = (l + h) / 2;
    if (ar[mid] == ele)
      c=mid;
    
    if (ele> ar[mid])
      l=mid+1;
      else h=mid-1;
    
    }
    if (c == -1)
      System.out.println ("Element not found");
    else
        System.out.println ("Element found at index  " + c);
  }
  
}
----------------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter array size and elements: 
6
9 8 7 6 4 5  
Enter search element: 
4
Element found at index 4
----------------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter array size and elements: 
5
1 2 3 4 5
Enter search element: 
21
Element not found 
