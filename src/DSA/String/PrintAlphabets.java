package DSA.String;

public class PrintAlphabets {
    public static void printAlphabets(char c1,char c2){
        for(char i=c1;i<=c2;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        char c1='a',c2='z';
        printAlphabets(c1,c2);
    }
}
