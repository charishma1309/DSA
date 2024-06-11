
import java.util.*;


public class sum_of_xor_of_pairs {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            long sum=0;
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            sum=count(n,a);
            System.out.println(sum);
        }
    }
    public static long count(int n,int a[])
    {
        long res=0;
        for(int i=0;i<32;i++)
        {
            long id=0;
            long z=0;   
            long o=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]%2==0)
                {
                    z++;
                }
                else
                {
                    o++;
                }
                a[j]/=2;
            }
            id=z*o*(1<<i);
            res+=id;
        }
        return res*2;
    }
}