class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxlen = 0;
        int start=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen,set.size());
        }
        return maxlen;
    }
}