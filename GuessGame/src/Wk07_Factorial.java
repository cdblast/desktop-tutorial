import java.util.Scanner;

public class Wk07_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int muilt = 0;


        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();

        while(input == 0){
            System.out.println(input * input--);
        }
    }
}
