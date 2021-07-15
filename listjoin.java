// java program to append an array list to another array list // date: 15 july 2021
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList <String> a=new ArrayList<String>();
	    ArrayList <String> b=new ArrayList<String>();
	    System.out.println("Enter list1 size and elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		    a.add(sc.nextLine());
		}
		System.out.println("Enter list2 size and elements:");
		int n2=sc.nextInt();
		for(int i=0;i<=n2;i++)
		{
		    b.add(sc.nextLine());
		}
		ArrayList <String> aplusb=new ArrayList<String>();
		aplusb.addAll(a);
		aplusb.addAll(b);
		for(int i=0;i<=n+n2+1;i++)
		{
		    System.out.print(" "+aplusb.get(i));
		}
	
}
}
/*----------------------------------------
output:
Enter list1 size and elements:

3

pink 

red 

3

Enter list2 size and elements:

3

blue

yellow

6

  pink  red  3  blue yellow 6
------------------------------------------
output:
Enter list1 size and elements:

1

gaya

Enter list2 size and elements:

1

thri

  gaya  thri

