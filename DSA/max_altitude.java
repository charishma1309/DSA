// Imagine a pilot starting the flight from the ground and flying over a series of different points at different heights. You are given an array, where A[i] represents heights.
// Currently, if pilot is at altitude X at ith point, and if he wants to reach (i+1)th point, his altitude will become X+A[i].
// The pilot starts at altitude 0 and wants to find the highest point he can reach during the entire journey. Your task is to print the highest altitude the pilot reaches.


import java.util.*;
public class max_altitude
 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            x=x+a[i];
            if(x>max)
            {
                max=x;
            }
        }
        System.out.println(max);       
    }
}