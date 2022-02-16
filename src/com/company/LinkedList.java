package com.company;

public class LinkedList {
   Node head;

    //Node Class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add Data at head
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public  void pop() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }

    public void popLast() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    }

    //Add Data at middle
    public void insertNode(Node prev_node, int newNode) {
        if (prev_node == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_Node = new Node(newNode);
        new_Node.next = prev_node.next;
        prev_node.next = new_Node;
    }

    //find Data by value
    public void findNode(int value) {
        Node tempNode = head;
        int index = 1;
        boolean flag = false;

        //checking head is null or not
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            //searching element using loop
            while (tempNode != null) {
                if (tempNode.data ==  value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println("The Value (" + value + ") you are searching is present at Index : " + (index-1) + " in the list.");
        }
        else {
            System.out.println("Element is not present in the list");
        }
    }

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
}