class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        
        for(int i=0;i<n;i++){
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String use = new String(curr);
            if(!map.containsKey(use)){
                map.put(use,new ArrayList<>());
            }
            map.get(use).add(strs[i]);
        }
        System.out.println(map);
        list.addAll(map.values());
        return list;
    }
}