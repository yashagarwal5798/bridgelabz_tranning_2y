package Linked_LIst;

public class StudentSystem {
    static class Node {
        int roll;
        String name;
        int age;
        char grade;
        Node next;
        Node(int r, String n, int a, char g) {
            roll=r;
            name=n;
            age=a;
            grade=g;
        }
    }
    Node head;
    void add(int r, String n, int a, char g) {
        Node node = new Node(r, n, a, g);
        if (head == null) head = node;
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
                curr.next = node;}
        }
    }
}
