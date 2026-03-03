package collections.List.LinkedList.CircularLinkedList;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data=data;
        this.next=null;
    }
}

public class LoopDetection {

    static boolean detectLoop(Node1 head){
        Node1 slow=head;
        Node1 fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node1 head=new Node1(10);
        head.next=new Node1(20);
        head.next.next=new Node1(30);
        head.next.next.next=new Node1(40);

        //Creating loop manually
        head.next.next.next.next=head;

        System.out.println(detectLoop(head));
    }
}
