<<<<<<< HEAD
class DoublyLinkedList {
=======
class Node {
    int data;
    Node next;
>>>>>>> e6240aa63a8fce2e945e705e4d7ddf923c6ef7d2

<<<<<<< HEAD
    // Node class representing each node of the doubly linked list
    static class Node {
        int data;
        Node next;
        Node prev;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;  // Head of the list

    // Constructor to initialize the doubly linked list
    public DoublyLinkedList() {
        head = null;
    }

    // Add a node at the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If the list is empty, the new node becomes the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  // Traverse to the last node
            }
            temp.next = newNode;  // Make last node point to the new node
            newNode.prev = temp;  // Make new node's prev point to the old last node
        }
    }

    // Display the list from head to tail
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add nodes to the list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        // Display the list
        list.displayList();
    }
}

=======
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class LinkedList {
    Node head;

    LinkedList(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(17);
        list.add(20);
        list.add(25);
    }
}
>>>>>>> e6240aa63a8fce2e945e705e4d7ddf923c6ef7d2