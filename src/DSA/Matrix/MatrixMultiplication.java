package DSA.Matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4}};
        int[][] b={{1,2},{3,4}};

        int row=a.length;
        int col=b[0].length;

        int[][] result=new int[row][col];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int[] m:result){
            for(int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
