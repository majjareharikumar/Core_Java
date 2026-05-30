package Instagram.String;

public class StringRotation {
    public static boolean areRotaion(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String doubled=s1+s1;
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(areRotaion("abcd","cdab"));
        System.out.println(areRotaion("abcd","acbd"));
    }
}
