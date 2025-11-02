package DSA.Code_IMPL;

public class CustomArray {
    private int arr[];
    private int size;
    private int capacity;

    public CustomArray(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }

    //Insert values to array
    public void insert(int element){
        if(size==capacity){
            System.out.println("Array is full");
            return;
        }
        else{
            arr[size++]=element;
        }
    }

    //Fetch values from Array
    public void fetch(){
        if(size==0){
            System.out.println("Array is empty");
            return;
        }
        else{
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    //Search Array by element
    public int search(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
               return i;
            }
        }
        return -1;
    }

    //Delete element
    public void delete(int element){
        int index=search(element);
        if(index==-1){
            System.out.println("No element found");
            return;
        }
        else{
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            System.out.println("Element deleted..!");
        }
    }

    public static void main(String[] args) {
        CustomArray ca=new CustomArray(5);
        ca.insert(1);
        ca.insert(2);
        ca.insert(3);
        ca.insert(4);
        ca.insert(5);
        ca.fetch();
        System.out.println();
        System.out.println("Element found at index:- "+ca.search(5));

        ca.delete(5);

        ca.fetch();

    }
}
