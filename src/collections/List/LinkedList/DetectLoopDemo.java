package collections.List.LinkedList;

class Node4{
    int data;
    Node4 next;

    Node4(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList4{
    Node4 head;

    void add(int data){
        Node4 newNode=new Node4(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node4 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void createLoop(){
        if(head==null){
            return;
        }

        Node4 temp=head;
        Node4 loopNode=head.next;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=loopNode;
    }

    boolean detectLoop(){
        Node4 slow =head;
        Node4 fast=head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                return true;
            }
        }
        return false;

    }

    void display(){
        Node4 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class DetectLoopDemo {
    public static void main(String[] args) {
        myLinkedList4 list=new myLinkedList4();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.display();

        list.createLoop();
        if(list.detectLoop()){
            System.out.println("Loop detected in List");
        }else{
            System.out.println("No loop in list");
        }

    }
}
