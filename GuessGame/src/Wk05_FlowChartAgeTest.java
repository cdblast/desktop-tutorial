import java.util.Scanner;

public class Wk05_FlowChartAgeTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teen or child");
        }
    }
}
