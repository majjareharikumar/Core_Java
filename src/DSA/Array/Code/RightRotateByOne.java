package DSA.Array.Code;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];

        int j=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            result[i]=arr[i-1];
        }
        result[0]=j;

        for(int n:result){
            System.out.print(n+" ");
        }
    }

}
