package com.company;

public class LinkedListProblem {
    public static void main(String args[]) {
        System.out.println("Welcome To Linked List Problem");

        System.out.println("\n===================");

        //Add Data at head in linked list
        System.out.println("Add Nodes");
        ListOperations.addData();
        System.out.println("\n===================");

        //Add Data at tail in linked list
        System.out.println("Append Nodes");
        ListOperations.appendData();
        System.out.println("\n===================");

        //Delete head data in linked list
        System.out.println("Delete First Node");
        ListOperations.deleteFirstData();
        System.out.println("\n===================");

        //delete tail data in linked list
        System.out.println("Delete Last Node");
        ListOperations.deleteLastData();
        System.out.println("\n===================");

        //Add Data at middle in linked list
        System.out.println("Insert Nodes");
        ListOperations.insertData();
        System.out.println("\n===================");
    }
}