class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (String token : tokens) {
            if (isNumeric(token)) {
                st.push(Integer.parseInt(token));
            } else {
                int n2 = st.pop();
                int n1 = st.pop();
                switch (token) {
                    case "+":
                        st.push(n1 + n2);
                        break;
                    case "-":
                        st.push(n1 - n2);
                        break;
                    case "*":
                        st.push(n1 * n2);
                        break;
                    case "/":
                        st.push(n1 / n2);
                        break;
                }
            }
        }
        return st.pop();
    }

    private boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    