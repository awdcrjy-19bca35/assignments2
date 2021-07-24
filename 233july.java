// java program to read array elements into HashMap and display using iterator // date: 23 july 2021
import java.util.*;
import java.lang.*;
class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size and key elements: ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter values for corresponding keys: ");
String s[]=new String[n];
for(int j=0;j<n;j++)
{
s[j]=sc.next();
}
HashMap<Integer,String> hash=new HashMap<Integer,String>();
for(int i=0;i<n;i++)
{
hash.put(a[i],s[i]);
}
Iterator it=hash.keySet().iterator();
while(it.hasNext())
{
int k=(int)it.next();
System.out.print(k);
System.out.println(" "+hash.get(k));
}
}
}
/*----------------------------------------
output:
Enter array size and key elements: 

5

1 2 3 6 7

Enter values for corresponding keys: 

this is java coding class

1 this

2 is

3 java

6 coding

7 class



