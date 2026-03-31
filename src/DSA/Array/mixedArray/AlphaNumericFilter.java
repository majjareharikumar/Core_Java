package DSA.Array.mixedArray;

public class AlphaNumericFilter {
    public static void main(String[] args) {
        char[] arr={'a','0','0','c','7'};
        int sum=0;

        for(char c:arr){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        if(sum==7){
            for(char c:arr){
               if(!Character.isDigit(c)){
                   System.out.print(c+" ");
               }
            }
        }
        else {
            System.out.println("Sum is not 7");
        }
    }
}
