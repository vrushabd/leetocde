class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;

                if (balance > 1) {
                    ans.append(c);
                }
            } else {
                balance--;

                if (balance > 0) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}