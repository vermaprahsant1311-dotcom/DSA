// class Solution {
//     public boolean isValid(String s) {
//         if(s.length() == 0) return true;

//         if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;

//         Deque<Character> stack1 = new ArrayDeque<>();

//         for(int i = 0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') stack1.push(ch);

//             else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){

//                 if(stack1.empty()) return false;
//                 char top = stack1.pop();

//                 if ((ch == ')' && top != '(') ||
//                     (ch == ']' && top != '[') ||
//                     (ch == '}' && top != '{')) {
//                     return false;
//                 }
//             }
//         }
        
//         return stack1.empty();
//     }
// }

class Solution {
    public boolean isValid(String s) {

        if(s.length() == 0) return true;

        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;

        Deque<Character> stack1 = new ArrayDeque<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack1.push(ch);
            }

            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){

                if(stack1.isEmpty()) return false ;

                char top = stack1.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack1.isEmpty();
    }
}