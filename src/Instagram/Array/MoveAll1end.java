package Instagram.Array;

public class MoveAll1end {
    public static void main(String[] args) {
        int[] arr={1,0,3,1,2,1,4,1};
        int p=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                arr[p]=arr[i];
                p++;
            }
        }
        while(p<arr.length){
            arr[p]=1;
            p++;
        }

        for(int j:arr){
            System.out.print(j+",");
        }
    }
}
