class Solution {
    public List<Integer> partitionLabels(String s) {
      List<Integer> list = new ArrayList<>();
       int[] lastindex = new int[26];
       for(int i=0;i<s.length();i++){
           lastindex[s.charAt(i)-'a']=i;
       }
        int i=0;
        while(i<s.length()){
            int end = lastindex[s.charAt(i)-'a'];
            int j =i;
            while(j!=end){
                end = Math.max(end ,lastindex[s.charAt(j++)-'a']);
            }
            list.add(j-i+1);
            i=j+1;
        }
        return list;
    }
}
