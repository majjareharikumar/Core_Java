package sorting;

//Selection sort will work based on the index swap.
//        Here's how:
//Selection Sort uses indexes to:
//Track the current position (i) in the array where the next smallest element should go.
//Search for the smallest element by checking every element from index i+1 to the end.
//Swap the element at index i with the index of the smallest element found.
//        🔁 Example with Indexes
//For array: [5, 3, 8, 4, 2]
//i = 0 → check from j = 1 to 4
//        → find min at index 4 (value 2)
//        → swap index 0 and index 4
//i = 1 → check from j = 2 to 4
//        → min is at index 1 (value 3) → no swap
//And so on...

public class SelectionSort {
    static void selectionSort(int a[]){
        for (int i=0;i<a.length-1;i++){
            int index=i;
            for(int j=i+1;j<a.length-1;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            if(i!=index){
                int t=a[i];
                a[i]=a[index];
                a[index]=t;
            }
        }
        for(int n:a){
            System.out.print(n+",");
        }
    }

    public static void main(String[] args) {
        int a[]={9,3,7,4,1,8};
        selectionSort(a);
    }
}
