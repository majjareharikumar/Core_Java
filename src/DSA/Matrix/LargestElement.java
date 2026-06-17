package DSA.Matrix;

public class LargestElement {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{40,5,6},{7,8,9}};

        int largest=matrix[0][0];
        for(int[] row:matrix){
            for(int n:row){
                if(n>largest){
                    largest=n;
                }
            }
        }
        System.out.println(largest);
    }
}
