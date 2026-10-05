class Solution {
    public int longestValidParentheses(String s) {
        int max = 0, len = s.length();
        int[] stack = new int[len + 1];
        stack[0] = -1;
        for (int i = 0, idx = 1; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack[idx++] = i;
            } else {
                idx--;
                if (idx == 0) {
                    stack[idx++] = i;
                } else {
                    max = Math.max(max, i - stack[idx - 1]);
                }
            }
        }
        return max;
    }
}