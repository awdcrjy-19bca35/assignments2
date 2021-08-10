import  java.util.*;
public class Main
{   
	public static void main(String[] args) {         
		Scanner sc=new Scanner(System.in); 
    System.out.println("Enter array size and elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
    {
		a[i]=sc.nextInt();
    }
		System.out.println("Enter search element: ");
		int ele=sc.nextInt();
        int c=BinarySearch(a,ele,0,n-1);
        if(c==-1) System.out.println("Element not found");
        else System.out.println("Element found at index "+c);
	}
	public static int BinarySearch(int ar[],int e, int l,int h)
	{
	    
	    int mid=(l+h)/2;
	    if(ar[mid]==e) return mid;
	    if(l>h) return -1;
	    if(e>ar[mid]) return BinarySearch(ar,e,mid+1,h);  //BINARY SEARCH USING RECURSION
	     return BinarySearch(ar,e,l,mid-1);
	    
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter array size and elements: 
6
9 8 7 6 4 5  
Enter search element: 
4
Element found at index 4
----------------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter array size and elements: 
5
1 2 3 4 5
Enter search element: 
21
Element not found 
