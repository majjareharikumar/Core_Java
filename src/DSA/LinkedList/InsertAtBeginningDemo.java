package DSA.LinkedList;



public class InsertAtBeginningDemo {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insertAtfirst(Node head,int data){
        Node newNode=new Node(data);

        newNode.next=head;
        //head=newNode;
        //return head;
        return newNode;
    }

    public static void display(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);

        Node result=insertAtfirst(head,1);
        display(result);

    }
}
