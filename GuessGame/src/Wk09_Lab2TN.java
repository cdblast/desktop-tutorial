import java.util.Scanner;

public class Wk09_Lab2TN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stop, count, a;
        count = 0;
        a = 1;
        System.out.println((a * a) + " = " + (a^2) + " = " + (a*=2));
        do {
            System.out.print("Enter the highest power of 2 (must be > 0): ");
            stop = scanner.nextInt();
        }while(stop <= 0);
        while(stop >= count){
            System.out.println("2^" + count + " = " + a);
            a = (a *= 2);
            count++;
        }
    }
}
