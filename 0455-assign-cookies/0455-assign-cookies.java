class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result =0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i < s.length&&j < g.length){
            if (s[i] >= g[j]) {
                result++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return result;
    }
}