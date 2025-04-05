import java.util.Scanner;

public class Wk03_NumberOrder {
    public static void main(String[] args) {
        Scanner fnr = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int a = fnr.nextInt();
        System.out.print("Please enter the second number: ");
        int b = fnr.nextInt();
        System.out.print("Please enter the third number: ");
        int c = fnr.nextInt();

        if(a == b && b == c){
            System.out.println("The numbers are the same");
        } else if(a > b && b > c){
            System.out.println("The numbers are in descending order");
        } else if(c > b && b > a){
            System.out.println("The numbers are in ascending order");
        } else if(a >= c || b >= a){
            System.out.println("I don't see a pattern here");
        }
    }
}
