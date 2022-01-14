class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum_clock=0;
        int sum_total=0;
      for(int i=0;i<distance.length;i++){
          if(start<destination &&(i>=start && i<destination)){
              sum_clock += distance[i];
          }
           if(start>destination &&(i>=start || i<destination)){
              sum_clock +=distance[i];
          }
          sum_total +=distance[i];
      }
        return Math.min(sum_clock, sum_total - sum_clock);
    }
}
