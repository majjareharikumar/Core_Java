package DSA.Array.mixedArray;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAsciiChars {

    public static void main(String[] args) {
        char[] arr = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z',

                'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',

                '0','1','2','3','4','5','6','7','8','9'
        };

        for(char c:arr){
          if(c%2==0){
              System.out.println(c+"->"+(int)c);
          }
        }
        System.out.println("************Java 8***************");
        //Java8
        List<Character> result=new String(arr).chars()
                .mapToObj(c->(char)c)
                .filter(c->c%2==0)
                .toList();
        for(char c:result){
            System.out.println(c+"->"+(int)c);
        }

    }
}
