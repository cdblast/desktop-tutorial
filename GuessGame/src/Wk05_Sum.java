import java.util.Scanner;

public class Wk05_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int sum = scanner.nextInt();

        System.out.println("The sum of all even numbers between 0 and " + sum + " is " + sum);

        System.out.println("The sum of all odd numbers between 0 and " + sum + " is " + sum);
    }
}
