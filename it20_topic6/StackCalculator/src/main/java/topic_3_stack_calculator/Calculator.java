package topic_3_stack_calculator;

public class Calculator {
    private Stack stack;

    public Calculator() {
        stack = new Stack();
    }

    public void pushValue(double value) {
        stack.push(value);
    }

    public double add() {
        double b = stack.pop();
        double a = stack.pop();
        double result = a + b;
        stack.push(result);
        return result;
    }

    public double subtract() {
        double b = stack.pop();
        double a = stack.pop();
        double result = a - b;
        stack.push(result);
        return result;
    }

    public double multiply() {
        double b = stack.pop();
        double a = stack.pop();
        double result = a * b;
        stack.push(result);
        return result;
    }

    public double divide() {
        double b = stack.pop();
        double a = stack.pop();
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = a / b;
        stack.push(result);
        return result;
    }
}
