package topic_4_queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue customerQueue = new Queue();

        while (true) {
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.enqueue(new Customer(name));
                    break;
                case 2:
                    customerQueue.dequeue();
                    break;
                case 3:
                    customerQueue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
