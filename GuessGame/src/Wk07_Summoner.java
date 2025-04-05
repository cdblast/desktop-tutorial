import java.util.Scanner;

public class Wk07_Summoner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stop, num, sum, count;
        num = 0;
        sum = 0;
        count = 0;

        do{
            System.out.print("What number should I count up to (1 or higher)? " );
            stop = scanner.nextInt();
        } while (stop <= 0);
        do{
            System.out.print("Should I add the number " + num + " to the sum? (y/n) ");
            String answer = scanner.next();
            if (answer.equals("y")) {
                sum = num + sum;
                count++;
                num++;
            }else if (answer.equals("n")) {
                num++;
            }
        } while (num <= stop);
        System.out.print("You added " + count + " numbers for a sum of " + sum);
/*        System.out.println("Sum is " + sum);*/
    }
}
