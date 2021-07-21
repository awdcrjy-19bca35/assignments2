// java program to read and display a stack // date: 20 july 2021
import java.util.*;
public class Main
{ public static void main(String[] args) {                                                                        
	  Scanner sc=new Scanner(System.in);                                                       
	  System.out.println("Enter array size and elements :");
	  int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		newst(a);
}
	 public static void newst(int a[])
    { 
     Stack <Integer> sta = new Stack <Integer> ();
     for(int i=0;i<a.length;i++)
     {
     sta.push(a[i]); 
     }
     System.out.println("Stack elements are: ");                      
     while(sta.isEmpty()==false)
     {
        System.out.println(" "+sta.peek());
        sta.pop();
     }
	                                                                                           
   }
} 

/* output:
Enter array size and elements :

5

6 7 4 3 2

Stack elements are: 

 2

 3

 4

 7

 6



