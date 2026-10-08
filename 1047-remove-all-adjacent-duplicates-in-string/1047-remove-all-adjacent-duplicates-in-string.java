class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String result ="";
        for(int i=0;i<s.length();i++){
            char var = s.charAt(i);
            if(!stack.isEmpty()&&stack.peek()==var){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }
        return result;
    }
}