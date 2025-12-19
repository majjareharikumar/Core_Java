package Exceptions.code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class try_with_resources {
    public static void main(String[] args) {
        try (BufferedReader df = new BufferedReader(new FileReader("Text.text"))) {
            System.out.println(df.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
