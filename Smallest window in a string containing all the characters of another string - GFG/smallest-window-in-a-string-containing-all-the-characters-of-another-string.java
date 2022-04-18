// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
        // Your code here
        // if(!s.contains(t)) return "-1";
       int[] count = new int[128];
       for(char c: t.toCharArray()){
           count[c]++;
       }
       int left=0;int right =0;
       int min = Integer.MAX_VALUE;
       int head =0;
       int n = t.length();
       
       while(right<s.length()){
           if(count[s.charAt(right++)] -- >0)  n--;
               while(n==0){
                   if (right - left < min) {
                    min = right - left;
                    head = left;
                }
                if (count[s.charAt(left++)]++ == 0) 
                    n++;
            }
               
       }
       return min == Integer.MAX_VALUE?"-1":s.substring(head,head+min);
    }
}