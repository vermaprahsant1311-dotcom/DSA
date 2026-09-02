class Solution {
    public int reverse(int x) {
        int rever=0;
        int num=0;
        int sign=1;
        if(x==0) return 0;
        if(x<0){
            sign=-1;
            x=-x;
        }
        while(x!=0){
            int rem=x%10;
            if (rever*sign<Integer.MIN_VALUE||rever> (Integer.MAX_VALUE-rem)/10) {
                return 0;
            }
            rever=rever*10+rem;
            x/=10;
        }
        return sign*rever;
    }
}
