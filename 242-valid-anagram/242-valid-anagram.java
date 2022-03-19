class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(); int m = t.length();
        if(n!=m) return false;
        int[] chars = new int[256];
        
        for(int i=0;i<n;i++){
            chars[s.charAt(i)]++;
            chars[t.charAt(i)]--;
        }
        
        for(int i:chars){
            if(i!=0) return false;
                        }
        return true;
    }
}