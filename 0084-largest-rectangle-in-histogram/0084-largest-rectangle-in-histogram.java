class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length, best =0;
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0; i<=n ; i++){
            int cur = (i==n)?0:h[i];
            while(!st.isEmpty()&&h[st.peek()]>cur){
                int height =h[st.pop()];
                int left= st.isEmpty()?-1:st.peek();
                int width = i-left-1;
                best = Math.max(best, height*width);
            }
            st.push(i);
        }
        return best;
    }
}