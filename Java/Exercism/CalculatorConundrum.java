class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int answer = 0;

        if (operation == "**"){
            throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == ""){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        switch(operation){
            case "+":
                answer = add(operand1, operand2);
                break;
            case "*":
                answer = times(operand1, operand2);
                break;
            case "/":
                answer = divide(operand1, operand2);
                break;   
        }
        return String.format("%s %s %s = %s", operand1, operation, operand2, answer);
    }
    private int add(int operand1, int operand2){
        return operand1 + operand2;
    }
    private int times(int operand1, int operand2){
        return operand1 * operand2;
    }
    private int divide(int operand1, int operand2){
        try { 
            return operand1 / operand2;
        } catch (ArithmeticException AE) {
            throw new IllegalOperationException("Division by zero is not allowed", AE);
        }
    }
}
