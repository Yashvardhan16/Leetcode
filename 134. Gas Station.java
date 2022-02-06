class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        int total =0;
        int n = gas.length;
        int index=0;
        for(int i=0;i<n;i++) {
       tank += gas[i] - cost[i];
             total += gas[i]-cost[i];
            if(tank < 0){
                index =i+1;
                tank =0;
            } 
        }
        return total>=0 ? index:-1;
    }
}
