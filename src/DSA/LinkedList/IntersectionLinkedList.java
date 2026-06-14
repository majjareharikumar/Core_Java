package DSA.LinkedList;

public class IntersectionLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static Node getIntersection(Node heada,Node headb){
        if(heada==null && headb==null){
            return null;
        }

        Node p1=heada;
        Node p2=headb;

        while (p1!=p2){
            p1=(p1==null)?headb:p1.next;
            p2=(p2==null)?heada:p2.next;
        }
        return p2;
    }
    public static void main(String[] args) {

        Node common=new Node(7);
        common.next=new Node(8);

        Node heada=new Node(1);
        heada.next=new Node(2);
        heada.next.next=new Node(3);
        heada.next.next.next=common;

        Node headb=new Node(4);
        headb.next=new Node(5);
        headb.next.next=common;

        Node result=getIntersection(heada,headb);
        if(result!=null){
            System.out.println("Intersection point is:- "+result.data);
        }else {
            System.out.println("No intersection");
        }
    }
}
