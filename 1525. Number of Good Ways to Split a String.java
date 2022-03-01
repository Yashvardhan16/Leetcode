class Solution {
    public int numSplits(String s) {
          int count =0;
        Map<Character,Integer> second = new HashMap<>();
          Map<Character,Integer> first = new HashMap<>();

          for(int i=0;i<s.length();i++){
              second.put(s.charAt(i),second.getOrDefault(s.charAt(i),0)+1);
          }

          for(int i=0;i<s.length();i++){
          first.put(s.charAt(i),first.getOrDefault(s.charAt(i),0)+1);    

          second.put(s.charAt(i),second.getOrDefault(s.charAt(i),0)-1);

          if(second.get(s.charAt(i))<=0){
              second.remove(s.charAt(i));
          }

          if(first.size()==second.size()){
              count++;
          }
          }
          return count;
    }
}
   
