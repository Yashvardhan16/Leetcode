class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] ans = new int[26];
        for(char c:chars.toCharArray()){
            ans[c-'a']++;
        }
        int count=0;
        for(String word:words){
            int[] temp = Arrays.copyOf(ans,ans.length);
            int valid =0;
            
            for(char c:word.toCharArray()){
                if(temp[c-'a']>0){
                    valid++;
                    temp[c-'a']--;
                }
            }
            if(valid==word.length()){
                count += word.length();
            }
        }
        return count;
    }
}
