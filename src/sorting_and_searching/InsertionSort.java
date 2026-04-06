package sorting_and_searching;

//Step-by-Step:
//Start from the second element (index 1).
//Compare it with the element(s) before it.
//If it’s smaller, shift the larger elements one position to the right.
//Insert the current element into its correct position.
//Repeat this for every element in the array.
//
//🔄 Example
//Sort [5, 3, 8, 4, 2]:
//Step 1: 3 compared with 5 → 3 < 5 → shift 5 → [5, 5, 8, 4, 2] → insert 3 → [3, 5, 8, 4, 2]
//Step 2: 8 is already in correct place
//Step 3: 4 compared with 8 → shift → [3, 5, 8, 8, 2]
//then compared with 5 → shift → [3, 5, 5, 8, 2]
//insert 4 → [3, 4, 5, 8, 2]
//Step 4: 2 compared and inserted at position 0 → [2, 3, 4, 5, 8]

public class InsertionSort {
    static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int n:a){System.out.print(n+",");}
    } 
    public static void main(String[] args) {

        int a[]={8,6,9,4,5,3,1,7,2};
        insertionSort(a);
    }
}
