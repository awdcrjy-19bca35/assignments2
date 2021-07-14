// java program to find the frequency of an element in given array // date: 14 july 2021
// java program to calculate simple interest // date: 14 july 2021
import java.util.*;
public class Main 
{   public static void freq(int a[],int k)
    { int f=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            f++;
        }
        System.out.println("Frequency of search element "+k+" is:" +f);
    }
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int j=0;j<n;j++) 
        {
            a[j]=s.nextInt();
        }
        System.out.println("Enter search element:");
        int k=s.nextInt();
        freq(a,k);
        
    }
}
/*------------------------------------------------------------
output:
Enter array size:

8

Enter array elements:

1 1 3 3 5 5 9 0

Enter search element:

2

Frequency of search element 2 is:0
---------------------------------------------------------
output:
Enter array size:

5

Enter array elements:

1 1 1 1 1 

Enter search element:

1

Frequency of search element 1 is:5



