class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* 
        [32.... 126] [000] 
        */
        if (s.length() == 0) {
            return 0; 
        }
        Set<Character> unique = new HashSet<>();
        int left_most = 0;
        int max_value = 1;
        for (int i = 0; i < s.length(); i++) {
            while(unique.contains(s.charAt(i))) {
                unique.remove(s.charAt(left_most));
                left_most++;
            }
            unique.add(s.charAt(i));
            max_value = Math.max(max_value, i - left_most + 1);
        }   
        return max_value;

        
    }
}
