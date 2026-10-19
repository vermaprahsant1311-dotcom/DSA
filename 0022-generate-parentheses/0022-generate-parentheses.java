class Solution {
    public void solve(int n,int open,int close,String ans,List<String>result){
        if(open==n&&close==n){
            result.add(ans);
            return;
        }
        if(open>n||close>open){
            return;
        }
        solve(n,open+1,close,ans+"(",result);
        solve(n,open,close+1,ans+")",result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String ans="";
        solve(n,0,0,ans,result);
        return result;
    }
}