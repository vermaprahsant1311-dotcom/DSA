class Solution {
    public int strStr(String haystack, String needle) {
    //    int output=-1;
    //    int[] arr1 = new int[haystack.lenght()];
    //    int[] arr2 = new int[needle.length()];
    //    for(int i = 0;i<arr1.length;i++){
    //     arr1[i]=haystack.charAt(i);
    //    } 
    //    for(int i = 0;i<arr2.length;i++){
    //     arr1[i]=needle.charAt(i);
    //    }
    //    int index =0;
    //    int solution=0;
    //    for (int i = 0; i < array1.length; i++) {
    //             if (array1[i] != array2[i]) {
                    
    //             }
    //     }
    for(int i = 0; i<=haystack.length()-needle.length();i++){
        int j=0;
        while(j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
            j++;
        }
        if(j==needle.length()){
            return i;
        }
    }
    return -1;
    }
}