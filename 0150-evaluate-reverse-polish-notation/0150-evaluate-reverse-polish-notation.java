class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0) return -1; 
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            String token = tokens[i];
            if(tokens[i].equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }else if(tokens[i].equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }else if(tokens[i].equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }else if(tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(token));
            }
        } 
        return stack.peek();
    }
}