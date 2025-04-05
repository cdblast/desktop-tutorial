import java.util.Scanner;

public class Wk05_Older {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Part A
        System.out.print("Please enter the age of child 1: ");
        int child1 = scanner.nextInt();
        System.out.print("Please enter the age of child 2: ");
        int child2 = scanner.nextInt();

        if(child1 > child2){
            System.out.println("The first child is older");
        }else if(child2 > child1){
            System.out.println("The second child is older");
        }else if(child1 == child2){
            //Part B
            System.out.println("Twinsies");
        }
    }
}
