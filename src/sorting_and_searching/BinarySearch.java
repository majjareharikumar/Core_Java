package sorting_and_searching;

//Binary Search is an efficient search algorithm used on sorted arrays.
//It repeatedly divides the search range in half to find the target value.
//-->How it Works (Simple Explanation):
//Find the middle element.
//If it matches the target → return index.
//If the target is less, search the left half.
//If the target is greater, search the right half.
//Repeat until found or range is empty.

public class BinarySearch {
    static int binarySearch(int a[],int key){
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key){
                return mid;
            }else if(a[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int re=binarySearch(a,9);
        if(re!=-1){
            System.out.println("Element "+9+" found at index : "+re);
        }

    }
}
