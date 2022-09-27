import java.util.Scanner;

public class LinkedList {

    Node head; // head of the list

    static class Node {
        int value;
        Node next;

        Node(int x) {
            this.value = x;
            this.next = null;
        }
    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node tempNode = head;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;

        return tempNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // list.head = new Node(1);

        // System.out.println(list.head);

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();
            Node newNode = list.insertAtTail(list.head, data);
            list.head = newNode;
        }

        list.insertAtFirst(20);

        list.printList();

        scan.close();
    }

}