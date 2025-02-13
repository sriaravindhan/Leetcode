class Solution {
    private int evaluateExpression(String token, int operand1, int operand2){
        switch(token){
            case "+":
                return operand1+operand2;
            case "-":
                return operand1-operand2;
            case "*":
                return operand1*operand2;
            case "/":
                return operand1/operand2;
        }
        return -1;
    }
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String token:tokens){
            if(!"+/-*".contains(token)){
                stack.push(Integer.valueOf((token)));
                continue;
            }
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int currentResult = evaluateExpression(token, operand1, operand2);
            stack.push(currentResult);
        }
        return stack.peek();
    }
}