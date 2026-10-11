class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            if (!stack.isEmpty() &&
                Math.abs(stack.peek() - input) == 32) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}