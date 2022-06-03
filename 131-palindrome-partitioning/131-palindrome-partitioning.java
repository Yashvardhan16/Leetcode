class Solution {
    public List<List<String>> partition(String s) {
       
        List<List<String>> list = new ArrayList<>();
         if(s.length()==0) return list;
        helper(list,new ArrayList<>(),s);
        return list;
    }
     void helper(List<List<String>> list, List<String> res, String s){
        if(s.length()==0){
            list.add(new ArrayList<>(res));
        }
        for(int i=0;i<s.length();i++){
            if(valid(s.substring(0,i+1))){
                res.add(s.substring(0,i+1));
                helper(list,res,s.substring(i+1));
                res.remove(res.size()-1);
            }
            
            
        }
     }
    boolean valid(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}