class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].matches("-?\\d+")) {
                scores.push(Integer.parseInt(operations[i]));
            } else if (operations[i].equals("C")) {
                scores.pop();
            } else if (operations[i].equals("D")) {
                scores.push(2 * scores.peek());
            } else if (operations[i].equals("+")) {
                int last = scores.pop();
                int secondLast = scores.peek();
                scores.push(last);
                scores.push(last + secondLast);
            }
        }

        int result = 0;
        for (Integer item : scores) {
            result += item;
        }

        return result;
    }
}