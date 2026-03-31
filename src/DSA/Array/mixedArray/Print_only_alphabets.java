package DSA.Array.mixedArray;

public class Print_only_alphabets {
    public static void main(String[] args) {
        char[] arr={'q','3','r','t','4','7','a'};
        for(char c:arr){
            if(!Character.isDigit(c)){
                System.out.print(c+" ");
            }
        }
    }
}
