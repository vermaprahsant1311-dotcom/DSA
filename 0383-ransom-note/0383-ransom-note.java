class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[magazine.length()];
        for(int i=0;i<ransomNote.length();i++){
            stack.push(ransomNote.charAt(i));
        }
        while (!stack.empty()) {
            char required = stack.peek();
            boolean found = false;

            for (int j = 0; j < magazine.length(); j++) {
                if (!used[j] && required == magazine.charAt(j)) {
                    used[j] = true;
                    stack.pop();
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}   