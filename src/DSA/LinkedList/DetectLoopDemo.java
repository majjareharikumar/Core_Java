package DSA.LinkedList;



public class DetectLoopDemo {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static boolean isLoopDetected(Node head){

        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        //create loop manually
        head.next.next.next.next=head;
        if(isLoopDetected(head)){
            System.out.println("Loop detected");
        }else {
            System.out.println("Loop not detected");
        }

    }
}
