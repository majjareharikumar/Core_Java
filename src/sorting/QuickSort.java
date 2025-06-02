package sorting;

//Quick Sort is a divide-and-conquer sorting algorithm that works by:
//Choosing a pivot element from the array.
//Partitioning the other elements into two subarrays:
//Elements less than the pivot go to the left.
//Elements greater than the pivot go to the right.
//Recursively apply the same steps to the left and right subarrays.
//Combine all to get a sorted array.

public class QuickSort {
    static void quickSort(int a[],int s,int e){
        int pivot=a[(s+e)/2];
        int i=s,j=e;

        while(i<=j){
            while (a[i]<pivot) i++;
            while(a[j]>pivot) j--;
            if(i<=j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
            if(s<j) quickSort(a,s,j);
            if(i<e) quickSort(a,i,e);
        }
    }

    public static void main(String[] args) {
        int a[]={7,9,2,3,10,4,6,5,1,8};
        quickSort(a,0,a.length-1);
        for(int n:a){System.out.print(n+" ");}
    }
}
