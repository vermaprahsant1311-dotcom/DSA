// class Solution {
//     public int mostWordsFound(String[] s) {
//         int max =0;
//         for(int i=0;i<s.length;i++){
//             int num =s[i].split(" ").length;
//             if(max < num){
//                 max=num;
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int mostWordsFound(String[] sentences) {
        // Max words in sentences
        int max = Integer.MIN_VALUE, words = 0;
        
        // Loop on each sentance
        for (String sentence : sentences){
            // Get the words count
            words = getWordsCount(sentence);

            // Check on last senctence count
            if (words > max){
                max = words;
            }
        }   
        // Return max words
        return max;
    }
    private int getWordsCount(String sentence){
        // Cached
        int words = 0;
        int length = sentence.length();

        // Loop on the characters
        for (int index = 0; index < length; index++){
            if (
                sentence.charAt(index) == ' ' ||
                index == length - 1           &&
                sentence.charAt(index ) != ' '
            ){
                words++;
            }
        }
        // Retrun words
        return words;
    }
}