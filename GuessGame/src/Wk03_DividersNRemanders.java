import java.util.Scanner;

public class Wk03_DividersNRemanders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ask the user to enter their first and second number.
        System.out.print("Enter the first number: ");
        int x = in.nextInt();
        System.out.print("Enter the second number: ");
        int y = in.nextInt();
        //prints out the divider
        System.out.println(x + "/" + y + " is the divier of " + (x/y));
        //Prints out the remander.
        System.out.println(x + "/" + y + " is the remander of " + (x%y));
        //Prints out the "x + 1" four times.
        System.out.print(x%y + " ");
        x = x + 1;
        System.out.print(x%y + " ");
        x = x + 1;
        System.out.print(x%y + " ");
        x = x + 1;
        System.out.print(x%y);
    }
}
