class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        int j=0;
        for(int i:nums){
            minheap.add(i);
            j++;
            if(j>k) minheap.poll();
        }
       
        return minheap.peek();
    }
}