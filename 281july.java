// hackerrank program // date: 29 july 2021
import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean prime(int n) 
    {
        boolean ans=true;
        for (int i = 2; i * i<=n; i++)
          {  if (n % i == 0) 
             {
                 ans=false;
             }
            else
             {
                 ans=true;
             }
          }
          return ans;
}

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter n,m values: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++)
        {
            boolean a=prime(i);
            boolean b=false;
            if(a==true  && (i+2)<=m)
                {
                b=prime(i+2);
                if(b==true)
                    count++;
            }
        }
        
        System.out.println(count);
        
    }
}
------------------------------------------------------
  output:
Enter n,m values: 

3

13

3            // [3,5], [5,7], [11,13]
-------------------
  Enter n,m values: 

10

20

2          // [11,13], [17,19]






