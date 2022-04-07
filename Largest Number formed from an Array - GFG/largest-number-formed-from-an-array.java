// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        if(arr.length==0) return"0";
        String [] ans = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans,(a,b) ->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        if(ans[0].equals("0")){
            return "0";
        }
        for(int i=0;i<arr.length;i++){
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}