package collections.List.LinkedList.CircularLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class myCircularLinkedList{
    Node head=null;
    Node tail=null;

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    void display(){
        if(head==null){
            return;
        }

        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        myCircularLinkedList cll=new myCircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);

        cll.display();

    }
}
