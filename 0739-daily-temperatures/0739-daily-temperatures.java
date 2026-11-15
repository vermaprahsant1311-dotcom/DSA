class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        //brute force method

        // for(int i = 0;i<temperatures.length-1;i++){
        //     int count = 0;
        //     for(int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[i]<temperatures[j]) {
        //             result[i]=j-i;
        //             break;
        //         }
        //     }
        // }


        //monotonic stack
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prev = stack.pop();
                result[prev]=i-prev;
            }

            stack.push(i);
        }
        return result;
    }
}