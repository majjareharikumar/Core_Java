package pattrensN_S;

public class right_triangle_S {
    public static void main(String[] args){
        int i,j,n=10;

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if (i==n-1 || j==0 || i>=j){System.out.print("*");}
                else {System.out.print(" ");}
            }
            System.out.println(" ");
        }

    }
}
