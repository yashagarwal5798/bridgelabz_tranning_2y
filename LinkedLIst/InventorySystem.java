package Linked_LIst;

public class InventorySystem {
    static class Node {
        String name;
        int id, qty;
        double price;
        Node next;
        Node(String n, int i, int q, double p) {
            name=n;
            id=i;
            qty=q;
            price=p; }
    }
    Node head;
    void add(String n, int i, int q, double p) {
        Node node= new Node(n, i, q, p);
        if (head==null) head = node;
        else { Node curr=head;
            while (curr.next!= null) {
                curr=curr.next;
            }
                curr.next=node;

        }
    }
}
