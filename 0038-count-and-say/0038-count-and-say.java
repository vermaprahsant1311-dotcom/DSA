class Solution {
    static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = nextTerm(result);
        }
        return result;
    }
    static String nextTerm(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c) {
                count++; 
                i++; 
            }
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}