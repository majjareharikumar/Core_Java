package DSA.LinkedList;

public class KthNodeFromStart {

    public static Node KthNodeStart(Node head,int k){
        if(head==null || k<=0){
            return null;
        }

        Node current=head;
        for(int i=1;i<k;i++){
            if(current==null){
                return null;
            }
            current=current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(1);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(6);

        Node result=KthNodeStart(head,3);
        if(result!=null){
            System.out.println("Kth Node element is :- "+result.data);
        }
        else{
            System.out.println("Invalid Kth element");
        }
    }
}
