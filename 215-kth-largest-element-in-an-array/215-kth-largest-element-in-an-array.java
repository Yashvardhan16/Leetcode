class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j=0;
        for(int i:nums){
            pq.add(i);
            j++;
            if(j>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}