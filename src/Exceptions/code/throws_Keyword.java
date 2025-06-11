package Exceptions.code;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.awt.SystemColor.text;

public class throws_Keyword {
    public static void readfile() throws IOException{
        BufferedReader br= new BufferedReader(new FileReader("Text.text"));
            System.out.println(br.readLine());
    }
    public static void main(String[] args) throws IOException {
        readfile();
    }
}
