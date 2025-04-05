/*
Take in the person's name and print out an individualized greeting
*/

import java.util.Scanner;

public class Wk01_Name {
    public static void main(String[] args) {
//Names: Jake Jureidini (jjureidini@csumb.edu),
//Date: 01/29/2025
//Description: Individualized greeting.
        Scanner scanner = new Scanner(System.in);
        //int Jack = "Hello, Jack";
        System.out.print("Please enter your first name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        //System.out.println(("Hello, Jack"));
        //System.out.println(("Hello, Rosario"));
        //System.out.println(Hello, Mary");
    }
}
