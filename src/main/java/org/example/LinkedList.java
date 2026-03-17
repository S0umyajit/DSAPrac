package org.example;

public class LinkedList {

    // The 'Manager' variables: They keep track of the entire list's state
    private Node head;   // Points to the very first node (the start)
    private Node tail;   // Points to the very last node (the end)
    private int length;  // Keeps track of how many nodes are in the list

    // Inner class representing a single 'link' in the chain
    class Node {
        int value;      // The actual data stored in this node
        Node next;      // A reference (pointer) to the next node in line

        // Constructor for a individual Node
        Node(int value) {
            this.value = value;
            // 'next' is automatically null by default
        }
    }

    /**
     * Constructor for the LinkedList.
     * When we create a list with one value, that value is both the head and the tail.
     */
    public LinkedList(int value) {
        // 1. Create a new node object in memory
        Node newNode = new Node(value);

        // 2. Point 'head' to this new node
        head = newNode;

        // 3. Point 'tail' to the same node (since it's the only one)
        tail = newNode;

        // 4. Set initial length
        length = 1;
    }
}