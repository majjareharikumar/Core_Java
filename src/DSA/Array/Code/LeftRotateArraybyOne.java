package DSA.Array.Code;

public class LeftRotateArraybyOne {
    public static int[] leftroatate(int[] arr){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr.length);
        int[] result=leftroatate(arr);
        for(int a: result){
            System.out.print(a+" ");// Out put:-0 3 6 2 3 4 2 6 -1
        }
    }
}
