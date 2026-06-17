package DSA.Matrix;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
