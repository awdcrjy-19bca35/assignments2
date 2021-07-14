// java program to calculate simple interest // date: 14 july 2021
import java.util.*;
public class SimpleIntr 
{   public static void si(float p, float t, float r)
    {
        float i=(p*t*r)/100;
        System.out.println(i);
    }
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principal,time and rate of interest:");
        float p=s.nextFloat();
        float t=s.nextFloat();
        float r=s.nextFloat();
        si(p,t,r);
        
    }
}
/*-----------------------------------------------------------------------
output:
Enter principal,time and rate of interest:

9000.0

1.0

2.0

180.0
------------------------------------------
output:
Enter principal,time and rate of interest:

5000.0

4.0

2.0

400.0




