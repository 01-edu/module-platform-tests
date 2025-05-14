public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node current;
        int count;
        if (index == 0) {
            return head.value;
        } else if (index == size - 1) {
            return tail.value;
        } else if (index <= (size - 1) / 2) {
            current = head;
            count = 0;
            while (count < index) {
                current = next(current);
                count++;
            }
        } else {
            current = tail;
            count = size - 1;
            while (count > index) {
                current = prev(current);
                count--;
            }
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node current;
        int count;
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else if (index <= (size - 1) / 2) {
            current = head;
            count = 0;
            while (count < index) {
                current = next(current);
                count++;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        } else {
            current = tail;
            count = size - 1;
            while (count > index) {
                current = prev(current);
                count--;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
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

    private Node prev(Node node) {
        System.out.println("Go to previous node");
        return node.prev;
    }
}
