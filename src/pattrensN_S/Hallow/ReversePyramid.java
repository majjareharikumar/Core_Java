package pattrensN_S.Hallow;

public class ReversePyramid {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==j && i<n/2 || i+j==n-1 && j>=n/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
