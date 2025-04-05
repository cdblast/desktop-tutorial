import java.util.Scanner;

public class Wk06_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yeno = "";

        do{
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();



            System.out.println("Enter 1 for add");
            System.out.println("Enter 2 for subtract");
            System.out.println("Enter 3 for multiply");
            System.out.println("Enter 4 for divide");
            System.out.println("Enter 5 for Remainder");
            int input = scanner.nextInt();

            if (input == 1){
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
            } else if (input == 2) {
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
            } else if (input == 3) {
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
            } else if (input == 4) {
                System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
            } else if (input == 5) {
                System.out.println("The remainder of " + num1 + " and " + num2 + " is " + (num1 % num2));
            }

            System.out.println("Do you want to do another operation? (yes/no) ");
            yeno = scanner.next();
        } while (!yeno.equalsIgnoreCase("no"));

/*        int sum = 1;

        do{
            System.out.println(sum);
        } while(sum != 1);*/
    }
}
