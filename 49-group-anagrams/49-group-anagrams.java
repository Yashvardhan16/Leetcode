class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String curr: strs){
            char[] chars =  curr.toCharArray();
            Arrays.sort(chars);
            String use = new String(chars);
            if(!map.containsKey(use)){
                map.put(use,new ArrayList<>());
            }
                map.get(use).add(curr);
            
        }
        list.addAll(map.values());
        return list;
    }
}