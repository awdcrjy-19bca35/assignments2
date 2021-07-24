// java program to read array elements into array list and display using iterator
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
ArrayList <Integer> arrl = new ArrayList <Integer>();
for(int i=0;i<n;i++)
arrl.add(a[i]);
Iterator <Integer> ite = arrl.iterator();
while(ite.hasNext())
{
Integer i1=(Integer)ite.next();
System.out.print(i1+" ");
}
}
}
/*----------------------------
output:
Enter array size and elements: 

5

8 7 6 1 2

8 7 6 1 2 

