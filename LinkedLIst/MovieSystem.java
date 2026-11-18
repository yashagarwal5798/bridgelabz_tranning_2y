package Linked_LIst;

public class MovieSystem {
    static class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;
        Node(String t, String d, int y, double r) {
            title=t;
            director=d;
            year=y;
            rating=r;
        }
    }
    Node head, tail;
    void add(String t,String d,int y, double r) {
        Node node = new Node(t, d, y,r);
        if (head == null) head=tail=node;
        else {
            tail.next=node;
            node.prev=tail;
            tail=node; }
    }
}
