class Solution {
    public int findMinFibonacciNumbers(int n) {
          PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(1);
        pq.add(1);
        while(pq.peek()<=n){
            int first = pq.poll();
            int second = pq.poll();
            int third = first+second;
            pq.add(first);    pq.add(second);   pq.add(third);

        }
        int sum = n;
        int count =0;

        while(pq.size()>0 && sum>0){
            if(pq.peek()>sum){
                pq.poll();
            }else{
                sum -=pq.poll();
                count++;
            }
        }
        return count;
    }
}
    
