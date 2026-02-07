package collections.List.LinkedList;

import java.util.*;

class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList2{
    Node2 head;

    void add(int data){
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
    }
    void reverse(){
        Node2 prev=null;
        Node2 curr=head;
        Node2 next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void display(){
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class ReverseLinkedListDemo {
    public static void main(String[] args) {
//        List<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
        myLinkedList2 list=new myLinkedList2();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.display();
        list.reverse();
        list.display();
    }
}
