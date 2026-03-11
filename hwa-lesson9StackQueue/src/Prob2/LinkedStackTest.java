package Prob2;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after push 5 nodes: " + stack.toString());

        System.out.println("Stack after peek:: " + stack.peek());
        System.out.println("Stack after peek: " + stack.toString());

        System.out.println("Stack after pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack.toString());

    }
}
