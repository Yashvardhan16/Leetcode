class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = 1_000_000_000;
        while(low<high){
            int mid = (high-low)/2 + low;
            if(helper(piles,h,mid)){
                 high = mid;
            }else
                low = mid+1;
        }
        return low;
        
    }
    boolean helper(int[] piles,int h,int k){
        int time =0;
        for(int p:piles){
            time += (p-1)/k +1;
            if(time>h) break;
        }
        return time<=h;
        
    }
}