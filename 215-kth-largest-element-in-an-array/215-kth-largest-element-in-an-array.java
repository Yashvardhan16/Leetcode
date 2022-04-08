class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            minheap.add(nums[i]);
            
        }
        for(int i=nums.length-1-k;i>=0;i--){
            minheap.poll();
        }
        return minheap.peek();
    }
}