package chapter_5.code_magnets_pg119;

public class multiFor {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++) {
            for(int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if(x == 1) {
                x++;
            }
        } // close outer for loop
    } // close main method
} // close class
