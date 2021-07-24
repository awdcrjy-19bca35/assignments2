// java program to read array elements into Hashset and display using iterator // date: 23 july 2021
import java.util.*;
class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size and elements: ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
Set<Integer> s=new HashSet<Integer>();
for(int i=0;i<n;i++)
{
s.add(a[i]);
}
Iterator <Integer> ite = s.iterator();
while(ite.hasNext())
{
Integer in=(Integer)ite.next();
System.out.print(in+" ");
}
}
}
/*----------------------------------
output:
Enter array size and elements: 

5

8 7 6 2 1

1 2 6 7 8 

------------------------------------
Enter array size and elements: 

8

1 9 2 8 8 3 0 5

0 1 2 3 5 8 9 

