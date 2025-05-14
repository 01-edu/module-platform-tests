public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int at(int index) {
        if (index < 0) {
            return -1;
        }
        Node current = head;
        int count = 0;
        while (count < index) {
            current = next(current);
            count++;
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = next(current);
            }
            current.next = newNode;
        }
        newNode.next = head;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0) {
           return;
        }
        if (index == 0) {
            Node current = head;
            while(current.next != head)
                current = current.next;
            head = head.next;
            current.next = head;
        } else {
            Node current = head;
            Node previous = null;
            int count = 0;
            while (count < index) {
                previous = current;
                current = next(current);
                count++;
            }
            previous.next = current.next;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}
