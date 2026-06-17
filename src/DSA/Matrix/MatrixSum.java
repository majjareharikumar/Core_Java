package DSA.Matrix;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        int sum=0;
        for(int[] row:matrix){
            for(int n:row){
                sum+=n;
            }
        }
        System.out.println(sum);
    }

}
