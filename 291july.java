class TestClass {
    static int n=100000;
    static int a[]=new int[n+1];
    public static void seive() {


        for(int i=0;i<=n;i++)
            a[i]=1;
            a[0]=0;
            a[1]=0;
        for(int i=2;i*i<=n;i++)
        {
         if(a[i]==1)
         {
            for(int j=i*i;j<=n;j=j+i)
                a[j]=0;
         }
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        seive();
        while(t>0)
      {  int c=0;
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if((a[i]==1)&&(a[n-i]==1))
            {
            c++;

            }

        }
        if(c>0)
        System.out.println("Deepa");
        else System.out.println("Arjit");
        t--;

        }
}
}
------------------------------------------------------------------------------------
OUTPUT:
Input
2
4
8
Output
Deepa
Deepa
Expected Correct Output
Deepa
Deepa
