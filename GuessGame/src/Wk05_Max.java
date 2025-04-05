import java.util.Scanner;

public class Wk05_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int a = scanner.nextInt();

        System.out.print("Enter a whole number: ");
        int b = scanner.nextInt();

        System.out.print("Enter a whole number: ");
        int c = scanner.nextInt();

        System.out.print("Enter a whole number: ");
        int d = scanner.nextInt();

        System.out.print("Enter a whole number: ");
        int e = scanner.nextInt();



        if(a > b && a > c && a > d && a > e){
            System.out.println("The largest number entered was " + a);
        } else if(b > a && b > c && b > d && b > e){
            System.out.println("The largest number entered was " + b);
        } else if(c > a && c > b && c > d && c > e){
            System.out.println("The largest number entered was " + c);
        } else if(d > a && d > b && d > c && d > e){
            System.out.println("The largest number entered was " + d);
        } else if(e > a && e > b && e > c && e > d){
            System.out.println("The largest number entered was " + e);
        } else{
            System.out.println("The largest number entered was 0");
        }
        System.out.println("Done");

        /*        int count = 0;*/

/*        while(count == 5){
            System.out.println("Enter a whole number: ");
            int input = scanner.nextInt();
            count++;
        }
        System.out.println("The largest number entered was ");*/
    }
}
