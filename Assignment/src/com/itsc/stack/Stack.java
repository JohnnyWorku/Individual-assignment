package com.itsc.stack;
public class Stack {
    int top;
    int size;

    public Stack(){
        this.size = 0;
        this.top = 0;
    }

    SinglyLinkedList stack = new SinglyLinkedList();

    public void size(){      // To retrieve the number of elements or the size of the stack.
        System.out.println(size);
    }

    public void isEmpty(){
        System.out.println(size == 0);
    }

    public void push(int value){
        stack.insertAtPos(value, ++top);
        size++;
    }

    public void pop(){

        if (stack.head == null) {
            System.out.println("The stack is empty ...");
            return;
        }
        else {
            peek(); // To print the data of the node at the peek of the stack.
            stack.deleteAtPosition(top--);
            size--;
        }
    }

    public void peek(){
        Node current = stack.head;

        if (current == null)
            throw new IllegalStateException("The stack is empty ...");

        for (int i = 1; i < top; i++){
            current = current.next;
        }
        System.out.println(current.data);
    }
}
