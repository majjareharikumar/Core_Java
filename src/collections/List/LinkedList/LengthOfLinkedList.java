package collections.List.LinkedList;

class Node5{
    int data;
    Node5 next;

    Node5(int data){
        this.data=data;
        this.next=null;
    }
}

class myLinkedList5{
    Node5 head;

    void add(int data){
        Node5 newNode=new Node5(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node5 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    int length(){
        int count=0;
        Node5 temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;

    }

    void display(){
        Node5 temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class LengthOfLinkedList {
    public static void main(String[] args) {
        myLinkedList5 list5= new myLinkedList5();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        list5.display();
        System.out.println(list5.length());
    }
}
