// java program to print the frequency of a value using hashmap // date: 19 july 2021
import java.util.*;
public class Main
{ public static void funct(int a[],int n)
{
    Map <Integer,Integer> map = new HashMap <Integer,Integer>();
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(a[i]))
        {
            map.put(a[i],map.get(a[i])+1);
        }
        else
        {
            map.put(a[i],1);
        }
    }
    System.out.print(map);
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter map size and elements");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
		funct(a,n);
	}
}
// output
Enter map size and elements

10

1 2 3 4 1 2 3 4 7 0

{0=1, 1=2, 2=2, 3=2, 4=2, 7=1}

