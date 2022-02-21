class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] ans1 = new int[26];
        int[] ans2 = new int[26];
        int count =0;
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(count>2){
                return false;
            }
            ans1[s1.charAt(i)-'a']++;
            ans2[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(ans1,ans2);
    }
}
