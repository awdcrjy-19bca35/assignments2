// java program to update array element with given element // date:16 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		System.out.println("Enter " +n+ " values:");
		Vector v=new Vector();
		for(int i=0;i<n;i++)
		{
		 v.add(sc.nextInt());   
		}
		System.out.println("Enter value in array, update value:");
		int k=sc.nextInt();
		int r=sc.nextInt();
		boolean present=v.contains(k);
		if(present)
		{
		    int in=v.indexOf(k);
		    v.set(in,r);
		    for(int i=0;i<n;i++)
		    {
		     System.out.print(" "+v.get(i));   
		    }
		}
		else 
		System.out.println("False");
	}
}
/*-----------------------------------
output:
Enter n value:

5

Enter 5 values:

10 20 30 40 50

Enter value in array, update value:

40 99

 10 20 30 99 50
-----------------------------------
output:
Enter n value:

4

Enter 4 values:

5 6 7 8

Enter value in array, update value:

2 8

False




