// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
       int[] dp = new int[A.length()];
       //set for the sole purpose of time complexity
       Set<String> set = new HashSet(B);
       for(int i =0;i<A.length();i++){
           for(int j=0;j<=i;j++){
               if(B.contains(A.substring(j,i+1))){
                   dp[i] += j>0 ? dp[j-1]:1;
               }
           }
       }
       return dp[A.length()-1];
    }
}