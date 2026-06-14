package DSA.LinkedList;



public class KthNodeFromEnd {

    public static Node KthNode(Node head,int k){
        if(head==null || k<=0){
            return null;
        }

        Node first=head;
        Node second =head;

        for(int i=0;i<k;i++){
            if(first==null){
                return null;
            }
            first=first.next;
        }

        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(5);

        int k=1;

        Node result=KthNode(head,k);
        if(result!=null){
            System.out.println("Kth node is:- "+result.data);
        }
        else{
            System.out.println("Invalid k value");
        }
    }
}


//✅ Algorithm: Find Kth Node from End (Two-Pointer Approach)
//Suppose:
//Linked List: 1 → 2 → 3 → 4 → 5
//k = 2
//Expected Output: 4
//
//Step 1
//Create two pointers:
//first  = head
//        second = head
//1 → 2 → 3 → 4 → 5
//        ↑
//F,S

//Step 2
//Move first pointer k steps ahead.
//For k = 2:
//1 → 2 → 3 → 4 → 5
//        ↑
//      first
//↑
//second
//Now the gap between first and second is 2 nodes.

//Step 3
//Move both pointers one step at a time.
//
//Iteration 1
//1 → 2 → 3 → 4 → 5
//            ↑
//         first
//
//    ↑
//second
//Iteration 2
// 1 → 2 → 3 → 4 → 5
//                 ↑
//              first
//        ↑
//second
//Iteration 3
//        1 → 2 → 3 → 4 → 5
//                          first = null
//                    ↑
//                 second
//Step 4
//When first becomes null, stop.
//second is pointing to the Kth node from the end.
//second = 4
