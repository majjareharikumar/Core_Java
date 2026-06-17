package DSA.Matrix;

public class SearchElement {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        boolean found=false;
        for(int[] row:matrix){
            for(int n:row){
                if(n==target){
                    found=true;
                }
            }
        }
        System.out.println(found);
    }
}
