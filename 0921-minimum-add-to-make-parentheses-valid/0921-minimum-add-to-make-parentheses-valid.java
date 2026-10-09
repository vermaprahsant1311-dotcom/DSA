class Solution {
    public int minAddToMakeValid(String s) {
        Stack<String> stack = new Stack<>();
        int j=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push("(");
            else if(!stack.isEmpty()&&s.charAt(i)==')') stack.pop();
            else j++;
        }
        return j+stack.size();
    }
}