// java program to diaplay menu using linked list // date:16 july 2021
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    LinkedList < Integer > L = new LinkedList < Integer >();
    System.out.println ("Enter list size and elements :");
    int n = s.nextInt ();
    for (int i = 0; i < n; i++)
     {
         L.add (s.nextInt ());
     }
    int cho, m;
    do
    {
  System.out.println("Enter your choice :");
	System.out.println(" 1.Begin Insert");
	System.out.println(" 2.End Insert");
	System.out.println(" 3.Position Insert");
	System.out.println(" 4.Begin Delete");
	System.out.println(" 5.End Delete");
	System.out.println(" 6.Position Delete");
	System.out.println(" 7.Display ");
	System.out.println(" 8.Exit ");
	cho = s.nextInt ();
	switch (cho)
	  {
	  case 1:
	    System.out.println ("Enter m value :");
	    m = s.nextInt ();
	    L.addFirst (m);
	    break;
	    case 2:
      System.out.println ("Enter m value :");
	    m = s.nextInt ();
	    L.addLast (m);
	    break;
	    case 3:
      System.out.println ("Enter m value :");
	    m = s.nextInt ();
	    System.out.println ("Enter index value");
	    int ind = s.nextInt ();
	     L.add (ind, m);
	     break;
	    case 4:
      L.removeFirst ();
	    break;
	    case 5:
      L.removeLast ();
	    break;
	    case 6:
      System.out.println("Enter index of element to be removed :");
	    int in = s.nextInt ();
	    L.remove (in);
	    break;
	    case 7:
      System.out.println ("Elements in the list :");
	    for (int i = 0; i < L.size (); i++)
      { 
        System.out.print (L.get (i) + " ");
      }
	      System.out.println();
	    }
      }
    while (cho != 8);
}
}
/*--------------------------------------------
output:
Enter number size and elements :

5

10 2 30 4 50

Enter your choice :

 1.Begin Insert

 2.End Insert

 3.Position Insert

 4.Begin Delete

 5.End Delete

 6.Position Delete

 7.Display 

 8.Exit 

7

Elements in the list :

10 2 30 4 50 

Enter your choice :

 1.Begin Insert

 2.End Insert

 3.Position Insert

 4.Begin Delete

 5.End Delete

 6.Position Delete

 7.Display 

 8.Exit 

8
-----------------------------------------------------------------------
Enter list size and elements :

5

1 2 3 4 5 

Enter your choice :

 1.Begin Insert

 2.End Insert

 3.Position Insert

 4.Begin Delete

 5.End Delete

 6.Position Delete

 7.Display 

 8.Exit 

1

Enter m value :

111

Enter your choice :

 1.Begin Insert

 2.End Insert

 3.Position Insert

 4.Begin Delete

 5.End Delete

 6.Position Delete

 7.Display 

 8.Exit 

7

Elements in the list :

111 1 2 3 4 5 

Enter your choice :

 1.Begin Insert

 2.End Insert

 3.Position Insert

 4.Begin Delete

 5.End Delete

 6.Position Delete

 7.Display 

 8.Exit 

8


