import java.util.Scanner;
import java.lang.Math;

public class Wk03_MathGame {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Please enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter number b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter number c: ");
        int c = scanner.nextInt();

        if(a == 0 || b == 0 || c == 0){
            System.out.print("Cannot use zero");
        }
        else {

            /*if ((a + b == c)) {
                System.out.println(a + " + " + b + " equals " + c);
            } else {
                System.out.println(a + " + " + b + " does not equal " + c + ", it equals " + (a + b));
            }
*/
            if ((a - b == c)) {
                System.out.println(a + " - " + b + " equals " + c);
            } else {
                System.out.println(a + " - " + b + " does not equal " + c + ", it equals " + (a - b));
            }

            if ((b - a == c)) {
                System.out.println(b + " - " + a + " equals " + c);
            } else {
                System.out.println(b + " - " + a + " does not equal " + c + ", it equals " + (b - a));
            }

           /* if ((a * b == c)) {
                System.out.println(a + " * " + b + " equals " + c);
            } else {
                System.out.println(a + " * " + b + " does not equal " + c + ", it equals " + (a * b));
            }

            if ((a / b == c)) {
                System.out.println(a + " / " + b + " equal " + c + ", with a remainder or " + (a / b));
            }else{
                System.out.println(a + " / " + b + " does not equal " + c + ", it equals " + (a / b) + " with a remainder of " + (a % b));
            }

            if ((b / a == c)) {
                System.out.println(b + " / " + a + " equal " + c + ", with a remainder or " + (b / a));
            }else{
                System.out.println(b + " / " + a + " does not equal " + c + ", it equals " + (b / a) + " with a remainder of " + (b % a));
            }*/
        }
    }
}
