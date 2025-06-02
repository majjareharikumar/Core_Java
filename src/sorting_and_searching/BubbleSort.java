package sorting_and_searching;


//Bubble Sort – Logic
//-->Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. It "bubbles" the largest (or smallest) element to the end in each pass.
//
//Example with Numbers
//Let's say we have this list: [5, 3, 8, 4, 2]
//-->First Round:
//Compare 5 and 3 → 5 is bigger → Swap → [3, 5, 8, 4, 2]
//Compare 5 and 8 → OK
//Compare 8 and 4 → Swap → [3, 5, 4, 8, 2]
//Compare 8 and 2 → Swap → [3, 5, 4, 2, 8] ← 8 is now at the end
//-->Second Round (ignore last number):
//Compare 3 and 5 → OK
//Compare 5 and 4 → Swap → [3, 4, 5, 2, 8]
//Compare 5 and 2 → Swap → [3, 4, 2, 5, 8]
//Keep going until no swaps are needed.

public class BubbleSort {

    static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }

    public static void main(String args[]){
        int a[]={9,2,3,8,7,5};
        bubbleSort(a);
        for(int n:a){
            System.out.print(n+",");
        }
    }

}
