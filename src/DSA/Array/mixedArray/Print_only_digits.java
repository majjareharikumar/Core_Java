package DSA.Array.mixedArray;

public class Print_only_digits {
    public static void main(String[] args) {
        char[] arr={'1','d','f','0','4','p','3'};
        for(char c:arr){
            if(Character.isDigit(c)){
                System.out.println(Character.getNumericValue(c));
            }
        }
    }
}
