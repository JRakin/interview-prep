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

        Node newNode = list.insertAtTail(list.head, 1);
        list.head = newNode;
        list.insertAtTail(list.head, 23);

        list.printList();
    }

}