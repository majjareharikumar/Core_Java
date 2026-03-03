package collections.List.LinkedList.DoublyLinkedList;



public class DoublyLinkedList {

    class Node2{
        int data;
        Node2 prev;
        Node2 next;

        Node2(int data){
            this.data=data;
        }
    }

    Node2 head=null;

    //Insert at End
    public void add(int data){
        Node2 newNode=new Node2(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node2 temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    //Insert at Beginning
    public void addFirst(int data){
        Node2 newNode=new Node2(data);
        if(head!=null){
            newNode.next=head;
            head.prev=newNode;
        }
        head=newNode;

    }

    //Display
    void display(){
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();

    }
}
