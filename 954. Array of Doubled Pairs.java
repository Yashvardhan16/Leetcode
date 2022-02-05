class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.getOrDefault(i,0)>0){
                int target = i<0 ? i/2 : i*2;
                
                if(i<0 && i%2!=0) return false;
            
            if(map.get(i)>map.getOrDefault(target,0)) return false;
            
                map.put(target,map.get(target) - map.get(i));
            }
        }
        return true;
    }
}
