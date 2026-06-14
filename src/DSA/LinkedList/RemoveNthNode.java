package DSA.LinkedList;

public class RemoveNthNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node removeNthNode(Node head,int k){

        Node slow=head;
        Node fast=head;

        //Move upto kth position
        for(int i=0;i<k;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
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
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        printList(head);
        Node result=removeNthNode(head,2);

        printList(result);
    }
}
