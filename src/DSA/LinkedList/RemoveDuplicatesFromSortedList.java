package DSA.LinkedList;

public class RemoveDuplicatesFromSortedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node removeDuplicates(Node head){
        Node current=head;

        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }

    public static void printList(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(5);

        System.out.println("Before removing duplicates");
        printList(head);

        System.out.println("After removing duplicates");
        Node result=removeDuplicates(head);
        printList(result);

    }
}
