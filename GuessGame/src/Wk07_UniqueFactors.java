import java.util.Scanner;

public class Wk07_UniqueFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int start, stop, count;
        count = 0;
        do{
            System.out.print("Enter a starting number (greater than 0): ");
            start = s.nextInt();
        }while(start <= 0);
        do{
            System.out.print("Enter a stopping number (greater than 1): ");
            stop = s.nextInt();
        }while(stop <= 1);

        while(stop != start){
            System.out.println("Factors for " + start + ": ");
            while(stop != count){
                System.out.print((start * 2) + " ");
                count++;
            }
            System.out.println(" ");
            System.out.println(start + " has " + count + " factors");
            count = 0;
        }
    }
}
