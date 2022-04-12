// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String s){
        int left =0,right =0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int max_len=0;
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max_len = Math.max(max_len,set.size());
            }else if(set.contains(s.charAt(left))){
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max_len;
    }
}