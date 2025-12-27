package DSA.String;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "Ja@va! is# ve$ry ea%sy";
        String result=str.replaceAll("[^a-zA-Z ]","");
        System.out.println(result);

        //Java8
        System.out.println("Using java 8");
        String re=str.chars()
                .filter(c->Character.isLetterOrDigit(c)||c==' ')
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .reduce("",String::concat);
        System.out.println(re);
    }
}
