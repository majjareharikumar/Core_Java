package DSA.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsorted {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static Node removeDuplicates(Node head){
        if(head==null) return null;
        Set<Integer> set=new HashSet<>();
        Node current=head;
        Node prev=null;

        while(current!=null){
            if(set.contains(current.data)){
                prev.next=current.next;
            }
            else {
                set.add(current.data);
                prev=current;
            }
            current=current.next;
        }
        return head;
    }
    public static void printList(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(4);

        printList(head);

        Node result=removeDuplicates(head);
        printList(result);
    }
}
