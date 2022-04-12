// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] entry=new int[n];
			for(int i=0;i<n;i++)
				entry[i]=sc.nextInt();
			int[] exit=new int[n];
			for(int i=0;i<n;i++)
				exit[i]=sc.nextInt();
			Solution ob= new Solution();
			int[] res=ob.findMaxGuests(entry,exit,n);
			for(int i=0;i<2;i++){
				System.out.print(res[i]);
			    System.out.print(" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int[] findMaxGuests(int[] a,int b[], int N){
        // add code here.
        Arrays.sort(a);
        Arrays.sort(b);
        //1 2 5 5 10
        // 4 5 9 12 12
        int[] ans = {0,0};
        int count=0;
        int i=0;int j=0;
        while(i<N && j<N){
            if(a[i]<=b[j]){
                count++;
            
            if(ans[0]<count){
                ans[0] = count;
                ans[1] = a[i];
            }
            i++;
            }
            else{
                count--;
                j++;
            }
        }
        return ans;
	}
}