package DataStructure;

public class LinkedList {

    Node head;

    static class Node{
        int value;
        Node next;

        Node(int d){
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedlist.head.next = second;
        second.next = third;

        while(linkedlist.head != null){
            System.out.println(linkedlist.head.value+" ");
            linkedlist.head = linkedlist.head.next;
        }
    }
}
