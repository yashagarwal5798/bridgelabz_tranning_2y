package Linked_LIst;

public class TaskScheduler {
    static class Node {
        int id;
        String name, due;
        int priority;
        Node next;
        Node(int i, String n, int p, String d) {
            id=i;
            name=n;
            priority= p;
            due=d; }
    }
    Node head;
    void add(int i, String n, int p, String d) {
        Node node=new Node(i, n, p, d);
        if (head==null) {
            head=node;
            head.next= head;
        }
        else {
            Node curr=head;
            while (curr.next!=head) curr=curr.next;
            curr.next=node;
            node.next=head;
        }
    }
}
