class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(popped.length!=pushed.length) return false;
        int j=0;
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<pushed.length;i++){
            
            stack.push(pushed[i]);
            while (!stack.isEmpty() && j < popped.length && popped[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}