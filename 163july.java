// java program to perform deletion on linkedlist // date: 17 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		LinkedList <Integer> L=new LinkedList <Integer>();
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		System.out.println("Enter "+n+ " values:");
		for(int i=0;i<n;i++)
		{
		    L.add(sc.nextInt());
		}
		System.out.println("Enter value to search:");
		int v=sc.nextInt();
		if(L.contains(v))
		{
		  L.remove(L.indexOf(v));
		  System.out.print("List After Deletion: ");
		  for(int i=0; i<L.size(); i++)
		  {
		  System.out.print( L.get(i)+" ");
          }
		}
		else
		System.out.println("Element not found.");
	}
}
/*---------------------------------------------
output 1:
Enter n value:

5

Enter 5 values:

10 20 30 40 50

Enter value to search:

30

List After Deletion: 10 20 40 50 
---------------------------------
output 2:
Enter n value:

5

Enter 5 values:

10 20 30 40 50

Enter value to search:

3

Element not found. 

