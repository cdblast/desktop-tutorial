import java.util.Scanner;

public class Wk04_EvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 1;
        int count = 0;



        while(input % 2 == 1){
            System.out.print("Please enter an even number: ");
            input = in.nextInt();
            count++;
            }
        System.out.print(input + " is an even number");
        if (count > 1){
            System.out.print("\nIt took you " + count + " tries!");
        } else {
            System.out.print("\nIt took you " + count + " try!");
        }

    }

}
