package pattrensN_S;

public class inverted_morrord_right_triangle {
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0 || j==n-1 || i<=j){System.out.print("*");}
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
