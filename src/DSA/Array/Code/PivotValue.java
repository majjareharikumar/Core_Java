package DSA.Array.Code;

public class PivotValue {

    public static int pivoteValue(int[] arr){

        int totalSum=0;
        for(int i:arr){
            totalSum+=i;
        }
        int leftSum=0,rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum=totalSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return arr[i];
            }
            leftSum+=arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.println(pivoteValue(arr));
    }
}
