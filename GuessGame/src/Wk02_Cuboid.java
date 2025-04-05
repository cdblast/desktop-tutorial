import java.util.Scanner;

public class Wk02_Cuboid {
    public static void main(String[] args) {
        Scanner cuber = new Scanner(System.in);
        System.out.print("Enter a width: ");
        double a = cuber.nextDouble();
        System.out.print("Enter a height: ");
        double b = cuber.nextDouble();
        System.out.print("Enter a depth: ");
        double c = cuber.nextDouble();
        System.out.println("The area of the cuboid (width = " + a + ", height = " + b + ", depth = " + c + ") is " + (((a*b) + (b*c) + (c*a))*2) + " square units ");
        System.out.print("the volume of the cuboid (width = " + a + ", height = " + b + ", depth = " + c + ") is " + (a * b * c) + " cubic units");
    }
}
