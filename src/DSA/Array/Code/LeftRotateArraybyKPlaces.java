package DSA.Array.Code;

public class LeftRotateArraybyKPlaces {
    public static int[] leftrotatebyk(int[] arr,int k){

        int[] arr1=new int[arr.length];
        while(k>0){
            int j=arr[0],i;
            for(i=0;i<arr.length-1;i++){
                arr1[i]=arr[i+1];
            }
            arr1[i]=j;
            arr=arr1;
            k--;
        }


        return arr1;
    }

    public static void main(String[] args) {
        int[] arr={3, 4, 1, 5, 3, -5};
        int k=8;
        int[] result=leftrotatebyk(arr,k);
        for(int a: result){
            System.out.print(a+" ");
        }
    }
}
