class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length()){
            return false;
        }
        int[] chars = new int[256];

        for(int i=0;i<t.length();i++){
            chars[s.charAt(i)]++;
            chars[t.charAt(i)]--;
        }
        for(int i:chars){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
