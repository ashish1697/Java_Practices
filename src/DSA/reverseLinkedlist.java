package DSA;

import java.util.LinkedList;

public class reverseLinkedlist {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node (int d){
            data =d;
            next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;

        while (curr!=null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    void printList(Node nde)
    {
        while (nde != null)
        {
            System.out.print(nde.data + " ");
            nde = nde.next;
        }
    }
    public static void main(String[] args) {
       /* LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);*/
    }
}
