import java.util.Scanner;
import java.lang.Math;

public class Wk03_BoringTwo {
    public static void main(String[] args) {
        Scanner bored = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = bored.nextDouble();
        System.out.print("Enter the second number: ");
        double b = bored.nextDouble();

        if((a > b)){
            System.out.print("The first number, " + a + ", is greater than the second number, " + b);
        } else if ((a == b)){
            System.out.print("The two numbers are equal - both are " + a);
        } else if ((b > a)){
            System.out.print("The second number, " + b + ", is greater than the first number, " + a);
        }
    }
}
