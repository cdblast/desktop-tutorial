import java.util.Scanner;

public class Wk01_Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a temperature: ");
        double t = s.nextDouble();
        System.out.println("If the Fahrenheit temperature is " + t + ", the Celsius temperature is " + (t-32)/1.8);
        System.out.println("If the Celsius temperature is " + t + ", the Fahrenheit temperature is " + ((t*9/5)+32));
    }
}
