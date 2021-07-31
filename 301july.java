class Solution {
    public boolean isUgly(int n) 
    {
        if(n<=0)
	{   return false;  }
        int a[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
		a[i]=i;
		a[0]=1;
		a[1]=1;
		}
		for(int i=2;i*i<=n;i++)
		{
		    if(a[i]==i)
		    {
		        for(int j=i*i;j<=n;j=j+i)
		        a[j]=i;
		    }
		}
            if(n==1)
            return true;
          int c=0;
	while(n>1)
        {
            if(a[n]>5)
            {
                c++;

            }
            n/=a[n];  
        }
        if(c>0) 
		return false;
        return true;
    }
}
---------------------------------------------------------------------------------------------------------------
OUTPUT:
Accepted
Runtime: 0 ms
Your input
6
Output
true
Expected
true
