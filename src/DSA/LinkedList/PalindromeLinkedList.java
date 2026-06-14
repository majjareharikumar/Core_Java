package DSA.LinkedList;

public class PalindromeLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;
    }
    public static boolean isPalindrome(Node head){
        if(head==null && head.next==null){
            return true;
        }
        //find middle
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse secondHalf
        Node secondHalf=reverse(slow);

        //compare
        Node firstHalf=head;
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);


        if(isPalindrome(head)){
            System.out.println("Given list is palindrome");
        }else{
            System.out.println("Given list is Not-palindrome");
        }

    }
}
