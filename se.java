// java program to search for an element in an array list // date: 15 july 2021
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList <Integer> a=new ArrayList<Integer>();
	    System.out.println("Enter list size and elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    a.add(sc.nextInt());
		}
		System.out.println("Enter search element:");
		int k=sc.nextInt();
		 boolean ans=a.contains(k);
		 if(ans)
		 {
		     System.out.println("Element Found");
		 }
		 else
		 {
		    System.out.println("Element Not Found"); 
		 }
	}
}
/*----------------------------------
output:
Enter list size and elements:

5

10 20 30 40 50

Enter search element:

5

Element Not Found
-----------------------------
output:
Enter list size and elements:

4

3 2 45 16

Enter search element:

16

Element Found






