package com.itsc.stack;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void insertAtPos(int data, int nodePosition){
        Node newNode = new Node(data);
        Node current = this.head;
        Node temp = null;

        if (nodePosition < 1)
            System.out.println("Position must be greater than or equal to one!");

        if (current == null && nodePosition > 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (current == null && nodePosition == 1){
            head = newNode;
            return;
        }

        if (nodePosition == 2){
            current.next = newNode;
            return;
        }


        for (int i = 1; i <= nodePosition - 2; i++) {
                current = current.next;
                temp = current.next; // A temporary variable to store the node that was at the position where we need to insert our new node.
            }
        current.next = newNode;
        newNode.next = temp;
    }

    public void deleteAtPosition(int nodePosition){
        Node current = head;
        Node prevNode = null; // to point the node placed before the node to be deleted.
        Node nextNode = null; // to point the node place after the node to be deleted.

        if (nodePosition == 1){
            head = current.next;
            current.next = null;
            return;
        }

        for (int i = 1; i < nodePosition; i++){
            prevNode = current;
            nextNode = current.next.next;
            current = current.next;
        }
        prevNode.next = nextNode;
        current.next = null;
    }

    public void deleteAfterNode(int givenNodePosition){
        Node current = head;
        Node prevNode = null; // to point the node placed before the node to be deleted.
        Node nextNode = null; // to point the node place after the node to be deleted.

        for (int i = 1; i <= givenNodePosition; i++){
            prevNode = current;
            nextNode = current.next.next;
            current = current.next;
        }
        prevNode.next = nextNode;
        current.next = null;
    }

    public void searchNode(int value){
        int position = 0;
        Node current = head;
        while (current != null){
            position++;
            if (current.data == value) {
                System.out.println("The node is at " + Integer.toString(position) + " place.");
                return;
            }
            current = current.next;
        }
        throw new IllegalStateException(Integer.toString(value) + " is not an element of the list.");
    }

    public void display(){
        Node current = head;

        if (current == null)
            System.out.println("There is no any element ...");

        while(current != null){
            System.out.print(current.data);
            if (current.next != null){
                System.out.print(" --> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
