package chapter_5.simple_dot_com;

import java.io.*;
import java.util.*;

public class GameHelper {
    public String getUserInput (String prompt) {
//        String inputLine = null;
        System.out.print(prompt + " ");

        Scanner sc = new Scanner(System.in);
        String inputLine = sc.next();
        if(inputLine.length() == 0) {
            return null;
        }

//        try {
//            BufferedReader is = new BufferedReader(
//            new InputStreamReader(System.in));
//            inputLine = is.readLine();
//            if (inputLine.length() == 0) return null;
//        } catch (IOException e) {
//            System.out.println ("IOException: " + e);
//            }

        return inputLine;
    } // close method
} // close class
