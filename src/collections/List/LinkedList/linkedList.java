package collections.List.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList{
    Node head;

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class linkedList {
    public static void main(String[] args) {

        myLinkedList list= new myLinkedList();
        list.add(10);
        list.add(11);
        list.add(12);
        list.display();
    }
}
