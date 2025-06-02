package sorting_and_searching;

//Merge Sort – Simple Explanation
//Merge Sort is a divide and conquer algorithm:
//        🔁 Steps:
//Divide the array into 2 halves.
//Sort each half (recursively using merge sort).
//Merge the two sorted halves into one sorted array.
//  🔄 Example
//For array: [5, 3, 8, 4, 2]
//Split: [5, 3] and [8, 4, 2]
//Split again: [5], [3] → merge → [3, 5]
//Split [8, 4, 2] → [8] and [4, 2]
//Merge [4, 2] → [2, 4]
//Merge [8] and [2, 4] → [2, 4, 8]
//Finally, merge [3, 5] and [2, 4, 8] → [2, 3, 4, 5, 8]
//✅ Sorted!

public class MergeSort {

    static void merge(int a[],int b[],int c[]){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }

    }

    static void sort(int a[]){
        if(a.length<=1) return;

        int left[]=new int[a.length/2];
        int right[]=new int[a.length-left.length];
        int i=0;
        for (i=0;i<left.length;i++){
            left[i]=a[i];
        }
        for (int j=0;j<right.length;j++){
            right[j]=a[i];
            i++;
        }
        sort(left);
        sort(right);
        merge(left,right,a);
    }
    public static void main(String[] args) {
        int a[]={9,4,8,10,1,7,2,3,5,6};
        sort(a);
        for (int n: a){System.out.print(n+" ");}
    }
}
