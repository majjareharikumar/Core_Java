package Instagram;

import java.util.Scanner;

public class InstaDms {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter message...");

        while (true){
            String s= scanner.nextLine();
            if(s.equalsIgnoreCase("pdf")){
                System.out.println("Here is your PDF link: \uD83D\uDCC4 https://example.com/sample.pdf");
            } else if (s.equalsIgnoreCase("url")) {
                System.out.println("Here’s the link 🔗 https://spring.io");

            } else  {
                System.out.println("Hey Hi, Thanks for you Message...!");
            }
        }
    }
}
