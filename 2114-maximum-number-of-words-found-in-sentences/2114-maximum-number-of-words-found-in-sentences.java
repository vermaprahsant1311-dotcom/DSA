class Solution {
    public int mostWordsFound(String[] s) {
        int max =0;
        for(int i=0;i<s.length;i++){
            int num =s[i].split(" ").length;
            if(max < num){
                max=num;
            }
        }
        return max;
    }
}
