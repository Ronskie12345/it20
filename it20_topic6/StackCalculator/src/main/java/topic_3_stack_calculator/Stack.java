package topic_3_stack_calculator;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Double> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(double value) {
        stack.add(value);
    }

    public double pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public double peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
