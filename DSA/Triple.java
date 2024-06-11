// Given an array of size 3X+1, where every element occurs three times, except one element, which occurs only once. Find the element that occurs only once.

import java.util.*;
public class Triple
 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int count=1;
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i]==a[j]&& i!=j)
                    {
                        count++;
                        break;
                    }
                }
                if(count<=1)
                {
                    System.out.println(a[i]);
                    break;
                }
                count=1;
            }
        }
    }
}