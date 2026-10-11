class Solution {
    public List<String> buildArray(int[] target, int n) {
        // if(target.length>n) return [""];
        int j=0;
        Stack<String> stack = new Stack<>();
        for(int i=1;i<=n&&j<target.length;i++){
            stack.push("Push");
            if(target[j]==i) {
                j++;
            }else{ 
                stack.push("Pop");
            }
        }
        List<String> list = new ArrayList<>(stack);
        return list;
    }
}