import java.util.Scanner;

public class Wk07_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int start, stop, count;

        System.out.print("Enter a starting number (greater than 0): ");
        start = s.nextInt();
        while(start <= 0){
            System.out.print("Enter a starting number (greater than 0): ");
            start = s.nextInt();
        } //this 'while loop' is the gate for acceptable answers

        count = start;
        
        System.out.print("Enter a stopping number (greater than " + start + "): ");
        stop = s.nextInt();
        while(stop <= start){
            System.out.print("Enter a stopping number (greater than " + start + "): ");
            stop = s.nextInt();
        } //this 'while loop' is the gate for acceptable answers

        int factors = 0; //to announce how many factors a num has

        while(count != (stop + 1)){
            System.out.print("Factors for " + count + ":");
            for(int i = 1; i <= count; i++){
                if(count % i == 0){
                    System.out.print(" " + i);
                    factors++;
                }
            }
            System.out.println(); // for new line
            System.out.println(count + " has " + factors + " factors");
            
            System.out.println(); // for new line

            count++;
            factors = 0;
        }
        
    }
}