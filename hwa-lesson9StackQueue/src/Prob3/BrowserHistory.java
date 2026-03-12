package Prob3;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentUrl;

    // Constructor
    public BrowserHistory(String startUrl) {
        this.currentUrl = startUrl;
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    // Visit a new URL
    public void visit(String url) {
        if (currentUrl != null) {
            backStack.push(currentUrl); // Push current URL to back stack
        }
        currentUrl = url;
        forwardStack.clear(); // Clear forward history when visiting new page
        System.out.println("Visited: " + currentUrl);
    }

    // Go back to previous URL
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to.");
        } else {
            forwardStack.push(currentUrl); // Push current URL to forward stack
            currentUrl = backStack.pop();  // Pop from back stack as new current
            System.out.println("Back to: " + currentUrl);
        }
    }

    // Go forward to next URL
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history.");
        } else {
            backStack.push(currentUrl); // Push current URL to back stack
            currentUrl = forwardStack.pop(); // Pop from forward stack as new current
            System.out.println("Forward to: " + currentUrl);
        }
    }
}