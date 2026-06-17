package DSA.Matrix;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {2,4,5},
                {3,5,6}
        };
        boolean symetric=true;
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    symetric=false;
                }
            }
        }
        System.out.println("Is Symmetric:-"+symetric);
    }
}
