package DSA.String;

public class ReverseStringByWords {
    public static void reverseString(String s){
        String[] arr=s.trim().split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String s="Majjare Hari Kumar";
        reverseString(s);
    }
}
