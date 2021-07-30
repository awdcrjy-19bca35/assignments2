import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int n=1000000;
    static boolean a[]=new boolean[n+1];
    public static void seive() {
        
        for(int i=0;i<n;i++)
            a[i]=true;
        for(int i=2;i*i<n;i++)
        {
         if(a[i]==true)
         {
            for(int j=i*i;j<n;j=j+i)
                a[j]=false;
         }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        seive();
        while(t>0)
        {
            int n1=sc.nextInt();
        if(a[n1]==true) System.out.println("Yes");
        else System.out.println("No");
            t--;
        }
    }
}
----------------------------------------------------------------------------------------------------------------------------
OUTPUT:
Input (stdin)

3
2
4
5
Your Output (stdout)

Yes
No
Yes
Expected Output

Yes
No
Yes
