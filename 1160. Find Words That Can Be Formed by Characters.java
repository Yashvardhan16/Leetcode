class Solution {
    public int countCharacters(String[] words, String chars) {
           int[] charsArray = new int[26];
        for (char c : chars.toCharArray()) charsArray[c - 'a']++;
        int sum = 0;
        MAIN_LOOP:
        for (String word : words) {
            int[] wordArray = new int[26];
            for (char c : word.toCharArray()) wordArray[c - 'a']++;
            for (int i = 0; i < 26; i++) 
                if (wordArray[i] > 0 && charsArray[i] < wordArray[i]) continue MAIN_LOOP;
            sum += word.length();
        }
        return sum;
        
    }
}
