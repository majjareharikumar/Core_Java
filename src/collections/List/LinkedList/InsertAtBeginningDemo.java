package collections.List.LinkedList;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList1{
    Node1 head;

    void add(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void addAtFirst(int data){
        Node1 newNode=new Node1(data);
        newNode.next=head;
        head=newNode;
    }

    void display(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}

public class InsertAtBeginningDemo {
    public static void main(String[] args) {
        myLinkedList1 list=new myLinkedList1();
        list.add(10);
        list.add(11);
        list.addAtFirst(9);
        list.display();

    }
}
