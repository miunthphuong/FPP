package Prob2;

public class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    //element is peek
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        Node current = top;
        while (current != null) {
            result.append(current.data);
            if (current.next != null)
                result.append(", ");
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
