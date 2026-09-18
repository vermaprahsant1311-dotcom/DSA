class Solution {
    public int SquareSum(int n){
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum+=remainder*remainder;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {

    while(true){
        if(n>10){
            n=SquareSum(n);
        }else if(n==1||n==7||n==10){
            return true;
        }else{
            return false;
        }
    }

    }
}