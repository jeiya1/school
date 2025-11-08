package stacks;

public class StacksLL {
    private Node top;
    private int size;

    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public StacksLL() {
        top = null;
        size = 0;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return '-';
        }
        char data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '-';
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = top;
        System.out.println("Stack: ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
