package DSA.Array.mixedArray;

public class Replace_digits_with_sum {
    public static void main(String[] args) {
        char[] arr={'w','4','t','7','g','o','8'};
        int sum=0;

        for(char c:arr){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        for(char c:arr){
            if(!Character.isDigit(c)){
                System.out.print(c+" ");
            }
        }
        System.out.println(sum);

    }
}
