import java.util.Scanner;

public class Wk01_Mulitply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the length of a line (whole numbers): ");
        int t = s.nextInt();
        System.out.println("The length is " + t);
        System.out.println("With sides of " + t + ", a square would have the area of " + (t * t));
        System.out.println("With sides of " + t + ", a cube would have the volume of " + (int)Math.pow(t, 3));
    }
}
