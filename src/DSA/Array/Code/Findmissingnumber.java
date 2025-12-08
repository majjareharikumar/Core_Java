package DSA.Array.Code;

public class Findmissingnumber {
    public static int missingNumber(int[] arr){
        int a=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=a){
                return arr[i]+a;
            }
        }
        return arr[arr.length-1]+a;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};

        System.out.println(missingNumber(arr));
    }
}
