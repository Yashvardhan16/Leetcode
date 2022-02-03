class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxHEap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
            
            maxHEap.addAll(map.keySet());
        
        StringBuilder ans = new StringBuilder();
        while(!maxHEap.isEmpty()){
            char current = maxHEap.remove();
            for(int i=0;i<map.get(current);i++){
                ans.append(current);
            }
        }
        return ans.toString();
    }
}
