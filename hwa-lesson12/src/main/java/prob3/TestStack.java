package prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        // Basic operations (these will break when you add checks—students will add try/catch later)
        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop, peek: " + stack.peek());
        stack.push(30);
        System.out.println("Stack: " + stack);

//        2. Overflow (use API exception)
        try {
            stack.push(40);  // should cause overflow
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

//        3. Null value (use API exception)
        try {
         stack.push(null);          // should cause null not allowed
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

//        1. Underflow (use API exception)
        try {
            stack.pop(); stack.pop(); stack.pop();// empty now
            stack.pop();            // should cause underflow
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack Exception (pop): " + e.getMessage());
        }

//        1. Underflow (use API exception)
        try {
            stack.peek();              // should cause underflow
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack Exception (peek): " + e.getMessage());
        }
    }
}
