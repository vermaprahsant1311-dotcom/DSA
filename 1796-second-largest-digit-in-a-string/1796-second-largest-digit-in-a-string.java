class Solution {
    public int secondHighest(String s) {
        int result =-1;
        int max =-1;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch-'0';
                if(num>max){
                    result = max;
                    max =num;
                }
                else if(num < max && num > result){
                    result =num;
                }
            }
        }
        return result;
    }
}