import java.util.Scanner;

public class Wk04_Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int input = in.nextInt();

        while (1 > input){
            System.out.print("Enter a positive number: ");
            input = in.nextInt();
        }
        while (input > 0){
            System.out.println(input);
            input--;
        }

        System.out.println("CONTACT!");
    }
}
