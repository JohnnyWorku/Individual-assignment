package com.itsc.todolist;

import java.util.ArrayList;

public class ToDoList {
    Node head;

    public ToDoList(){
        this.head = null;
    }

    public void addToDo(Task task){
        Node newTask = new Node(task);
        if (head == null){
            head = newTask;
            return;
        }

        else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void markToDoAsCompleted(String taskTitle){
        Node current = head;
        while (current != null){
            if (current.task.getTitle().equals(taskTitle)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found in the list.");
    }

    public void viewToDoList(){ // It displays all uncompleted tasks first and then the completed ones.
        Node current = head;
        Node temp = head;
        ArrayList <Node> completedTasks = new ArrayList<>(); // An arraylist used to store completed tasks.
        System.out.println("To do list: ");
        if (current == null)
            System.out.println("No tasks ...");

        else {
            while (current != null) {
                if (!current.task.isCompleted()) {
                    System.out.println(current.task.toTaskString());
                }
                else{
                    completedTasks.add(current);
                }
                current = current.next;
            }
            for (Node n : completedTasks){
                System.out.println(n.task.toTaskString());
            }
        }
    }
}
