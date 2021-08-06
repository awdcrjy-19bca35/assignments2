import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	  ArrayList<Integer> l=new ArrayList<Integer>();
	  System.out.println("Possible sub arrays :");

	  for(int i=0;i<n;i++)
	  {
	      for(int j=i;j<n;j++)
	      {
	          for(int k=i;k<=j;k++)
	          l.add(a[k]);
	          System.out.print(l+" ");
	          l.clear();
	      }
	  }
	}
----------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
3
1 2 3
Possible sub arrays :
[1] [1, 2] [1, 2, 3] [2] [2, 3] [3] 
