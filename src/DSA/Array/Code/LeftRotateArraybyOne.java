package DSA.Array.Code;

public class LeftRotateArraybyOne {
    public static int[] leftroatate(int[] arr){
        int[] arr1=new int[arr.length];
        int j=arr[0],i;
        for(i=0;i<arr.length-1;i++){
            arr1[i]=arr[i+1];
        }
        arr1[i]=j;
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr={-1, 0, 3, 6,2,3,4,2,6};
        int[] result=leftroatate(arr);
        for(int a: result){
            System.out.print(a+" ");
        }
    }
}
