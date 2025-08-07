package Interview;


import java.util.Stack;

public class practice {

    static class Stack {
        int maxsize;
        int top;
        int[] stackArray;


        Stack(int size) {
            maxsize=size;
            top=-1;
            stackArray=new int[size];
        }

        //push
        void push(int n){
            if(top==maxsize-1){
                System.out.println("Stack is full");
            }else{}
            stackArray[++top]=n;
            System.out.println("Value pushed");
        }
        //Peek
        void peek(){
            if(top==-1){
                System.out.println("Stack is empty");
            }else{
                System.out.println(stackArray[top]);
            }
        }
        //pop
        void pop(){
            if(top==-1){
                System.out.println("Stack is empty");
            }
            else {
                System.out.println(stackArray[top--]);
            }
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack(5);

        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.peek();
        stack.pop();


    }
}
