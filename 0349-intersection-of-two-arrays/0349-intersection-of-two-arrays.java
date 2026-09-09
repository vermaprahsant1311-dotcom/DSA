class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> numbers = new ArrayList<>();
        if(nums1.length>nums2.length){
            for(int num:nums1){
                int check = num;
                for(int res:nums2){
                    if(check==res && !numbers.contains(num)){
                        numbers.add(check);
                        break;
                    }
                }
            }    
        }else{
            for(int num:nums2){
                int check = num;
                for(int res:nums1){
                    if(check==res && !numbers.contains(num)){
                        numbers.add(check);
                        break;
                    }
                }
            } 

        }
        int[] manualArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            manualArray[i] = numbers.get(i); // Autounboxing happens here
        }
        return manualArray;
    }
}