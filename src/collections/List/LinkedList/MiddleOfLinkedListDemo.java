package collections.List.LinkedList;

import java.util.*;

class Node3{
    int data;
    Node3 next;

    Node3(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList3{
    Node3 head;

    void add(int data){
        Node3 newNode=new Node3(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node3 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void findMiddle(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node3 slow=head;
        Node3 fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println("Middle element:- "+slow.data);
    }
    void display(){
        Node3 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class MiddleOfLinkedListDemo {
    public static void main(String[] args) {
        myLinkedList3 list=new myLinkedList3();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.display();
        list.findMiddle();

//        List<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(list1.get(list1.size()/2));
    }
}
