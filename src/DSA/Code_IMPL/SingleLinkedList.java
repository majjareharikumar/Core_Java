package DSA.Code_IMPL;
//🔹 Concept:
//A Linked List is a linear data structure where each element (called a node)
//contains two parts:
//data → the actual value
//next → a reference (link) to the next node
//        Unlike arrays, elements are not stored in contiguous memory, and size is dynamic.

public class SingleLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    private Node head;

    //Insert element at End

    public void insert(int data){
        Node newnode =new Node(data);

        if(head==null){
            head=newnode;
            return;
        }

        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }

    //Display list
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        System.out.println("Linked list ");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.insert(10);
        singleLinkedList.insert(20);

        singleLinkedList.display();
    }

}
