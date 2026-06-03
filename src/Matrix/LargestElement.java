package Matrix;

public class LargestElement {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {79,9,12},
                {45,78,19}
        };
        int largeNum=matrix[0][0];

        for(int[] row:matrix){
            for(int i:row){
               if( i>largeNum){
                   largeNum=i;
               }
            }
        }
        System.out.println(largeNum);
    }
}
