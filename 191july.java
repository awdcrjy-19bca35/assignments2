// java program to perform various hashmap functions / date: 19 july 2021
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Map <Integer,Integer > map = new HashMap < Integer,Integer >();
    map.put(1,8);
    map.put(2,123);
    map.put(3,64);
    char cho;
    do
    {
    System.out.println("Enter your choice :");
	System.out.println(" a.To add an entry with key x and value y to the Hashmap");
	System.out.println(" b.To print value of x if it is present in Hashmap, else print -1");
	System.out.println(" c.To print the size of Hashmap");
	System.out.println(" d.To remove an entry with key x from the Hashmap");
	System.out.println(" e.To Exit");
	cho = sc.next().charAt(0);
	switch (cho)
	  {
	  case 'a':
	       System.out.println ("Enter key and value");
	    map.put (sc.nextInt(),sc.nextInt());
	    break;
	    
	    case 'b':
	        System.out.println("Enter search element's key value :");
	    int k = sc.nextInt ();
	    if (map.containsKey (k))
	    {
	        System.out.println (map.get (k));
	    }
	    else
	    {
	        System.out.println ("-1");
	    }
	    break;
	    case 'c':
	        System.out.println ("Size of the map is: "+map.size ());
	    break;
	    case 'd':
	        System.out.println("Enter key value of the element to be removed:");
	      map.remove (sc.nextInt ());
	      break;
	  }
      }while (cho != 'e');
}
}


/*--------------------------------------
output:
Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

c

Size of the map is: 3

Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

a

Enter key and value

5 10

Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

c

Size of the map is: 4

Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

d

Enter key value of the element to be removed:

3

Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

b

Enter search element's key value :

3

-1

Enter your choice :

 a.To add an entry with key x and value y to the Hashmap

 b.To print value of x if it is present in Hashmap, else print -1

 c.To print the size of Hashmap

 d.To remove an entry with key x from the Hashmap

 e.To Exit

e
