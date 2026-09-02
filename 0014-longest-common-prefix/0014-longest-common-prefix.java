class Solution {
    public String longestCommonPrefix(String[] strs) {
        int Shorteststring=0;
        Arrays.sort(strs);
        String prefix = strs[0];
        for(int i=01;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;

    }
}