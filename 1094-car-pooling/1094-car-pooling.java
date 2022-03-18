class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int m = trips[0].length;
        int[] sum = new int[1001];
        for(int[] i:trips ){
            sum[i[1]] += i[0];
            sum[i[2]] -= i[0];
        }
        for(int j:sum){
            capacity-=j;
            if(capacity<0) return false;
        }
        return true;
    }
}