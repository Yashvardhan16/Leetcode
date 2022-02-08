class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String current:strs){
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String ans = new String(chars);
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(current);
        }
    list.addAll(map.values());
    return list;
    }
}
