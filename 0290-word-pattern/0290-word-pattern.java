class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        HashMap<Character, String> chartoword = new HashMap<>();
        HashMap<String, Character> wordtochar = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(chartoword.containsKey(c)&&!chartoword.get(c).equals(word)){
                return false;
            }
            if(wordtochar.containsKey(word)&&!wordtochar.get(word).equals(c)){
                return false;
            }
            chartoword.put(c, word);
            wordtochar.put(word, c);
        }
        return true;    

    }
}