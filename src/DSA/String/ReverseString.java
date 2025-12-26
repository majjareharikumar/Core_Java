package DSA.String;

public class ReverseString {
    public static void main(String[] args) {
        String str="majjareharikumar";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        String re=str.chars()
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .reduce("",(a,b)->b+a);
        System.out.println(re);
    }
}
