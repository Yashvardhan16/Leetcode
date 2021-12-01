class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int[] count = new int[26];
		 
        for (char ch : magazine.toCharArray()) {
            count[(int) ch - (int) 'a'] += 1;
        }
	
        for (char ch : ransomNote.toCharArray()) {
            count[(int) ch - (int) 'a'] -= 1;
        }
        for (int i : count) {
            if (i < 0)
                return false;
        }
        return true;
    }
}
