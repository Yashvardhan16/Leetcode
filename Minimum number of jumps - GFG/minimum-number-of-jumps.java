// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        if( arr[0]==0 && arr.length==1 )return 0;
       if(arr[0]==0)return -1;
        int reach =0;
        int last =0;
        int count =0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            reach = Math.max(reach,arr[i]+i);
            if(i==last){
                if(i==reach) return-1;
                count++;
                last=reach;
            }
        }
        return count;
    }
}