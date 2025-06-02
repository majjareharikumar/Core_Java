package sorting_and_searching;

//Linear Search is the simplest search algorithm.
//It checks each element of the array one by one until it finds the target value or reaches the end.
//


public class LinearSearch {
    static int linearSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={7,9,3,5,6,10,2,4};
        int k=5;
        System.out.println(linearSearch(a,k));
        int results=linearSearch(a,k);
        if(results!=-1){
            System.out.println("Element "+k+" found at index :- "+results);
        }
        else System.out.println("Element not found");

    }
}
