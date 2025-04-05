import java.util.Scanner;
import java.lang.Float;

public class Wk02_Boring {
    public static void main(String[] args) {
        Scanner bored = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Float a = bored.nextFloat();
        System.out.print("Enter the second number: ");
        Float b = bored.nextFloat();

        System.out.println("The bigger number is " + Math.max(a, b));

        System.out.println("Is " + a + " the bigger number? " + (a>=b));

        System.out.print("Is " + b + " the bigger number? " + (b>a));
    }
}
