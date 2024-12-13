package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        // Accept user input for adding elements to the list
        System.out.println("Enter the number of songs to add to the linked list:");
        int numSongs = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numSongs; i++) {
            System.out.println("Enter song title:");
            String songTitle = scanner.nextLine();
            list.add(songTitle);
        }

        System.out.println("\nCurrent Linked List:");
        System.out.println("------------------------------");
        list.printList();

        // Deleting a node by value
        System.out.println("Enter a song title to delete:");
        String songToDelete = scanner.nextLine();
        list.deleteByValue(songToDelete);
        System.out.println("\nAfter Deleting \"" + songToDelete + "\":");
        System.out.println("------------------------------");
        list.printList();

        // Moving a node pointer
        System.out.println("Enter current index of the node to move:");
        int currentIndex = scanner.nextInt();
        System.out.println("Enter new index for the node:");
        int newIndex = scanner.nextInt();
        list.moveNodePointer(currentIndex, newIndex);
        System.out.println("\nAfter Moving Node from index " + currentIndex + " to " + newIndex + ":");
        System.out.println("------------------------------");
        list.printList();

        scanner.close();
    }
}
