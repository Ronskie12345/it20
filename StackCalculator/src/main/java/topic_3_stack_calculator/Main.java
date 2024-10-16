package topic_3_stack_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the Stack Calculator...");

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Enter numbers and operations (+, -, *, /). Type 'exit' to quit.");

        while (running) {
            System.out.print("Enter a number or operation: ");
            String input = scanner.nextLine();

            try {
                switch (input) {
                    case "+":
                        System.out.println("Result: " + calculator.add());
                        break;
                    case "-":
                        System.out.println("Result: " + calculator.subtract());
                        break;
                    case "*":
                        System.out.println("Result: " + calculator.multiply());
                        break;
                    case "/":
                        System.out.println("Result: " + calculator.divide());
                        break;
                    case "exit":
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        double value = Double.parseDouble(input);
                        calculator.pushValue(value);
                        System.out.println("Pushed: " + value);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Calculator has stopped.");
    }
}
