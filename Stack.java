import java.util.*;
class Stack {
    private int[] stackArray; // Array to store stack elements
    private int top; // Index of the top element in the stack
    private int maxSize; // Maximum size of the stack
    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }
    // Method to push an element into the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        }
    }
    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow"); // Throw exception if stack is empty
        } else {
            int element=stackArray[top--];
            System.out.println("Popped element: " + element);
    }
    }
    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i] + " ");
            }
        }
    }
    // Helper method to check if the stack is full
    private boolean isFull() {
        return top == maxSize - 1;
    }
    // Helper method to check if the stack is empty
    private boolean isEmpty() {
        return top == -1;
    }
    // Main method to test the Stack class
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5
        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // Display stack elements
        stack.display();
        // Try to push an element into a full stack
        stack.push(60);
        // Pop elements from the stack
        stack.pop();
        stack.pop();
        // Display stack after popping
        stack.display();
    }
}
