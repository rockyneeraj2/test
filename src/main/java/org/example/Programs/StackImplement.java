package org.example.Programs;

public class StackImplement {

    public static void main(String[] args) {

        class Stack {
            int[] stack;
            int top;
            int size;

            // Constructor
            Stack(int size) {
                this.size = size;
                stack = new int[size];
                top = -1;
            }

            // Push operation
            void push(int value) {
                if (top == size - 1) {
                    System.out.println("Stack Overflow");
                    return;
                }
                stack[++top] = value;
                System.out.println(value + " pushed into stack");
            }

            // Pop operation
            int pop() {
                if (top == -1) {
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return stack[top--];
            }

            // Peek operation
            int peek() {
                if (top == -1) {
                    System.out.println("Stack is empty");
                    return -1;
                }
                return stack[top];
            }

            // isEmpty
            boolean isEmpty() {
                return top == -1;
            }
        }

    }
}
