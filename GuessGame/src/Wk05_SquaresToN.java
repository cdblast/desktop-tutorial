import java.util.Scanner;

public class Wk05_SquaresToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int square = 0;
        int count = 0;


        System.out.print("Enter the maximum number: ");
        int input = scanner.nextInt();

        while(square < input){
            System.out.print(square + " ");
            count = count + 1;
            square = count * count;
        }
    }
}
