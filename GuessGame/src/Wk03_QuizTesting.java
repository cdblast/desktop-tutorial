import java.util.Scanner;

public class Wk03_QuizTesting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score;
        System.out.print("What was your score? ");
        score = in.nextInt();

        if (score >= 90){
            System.out.print("Your score is " + score + " or higher - A");
        }
        else if (score >= 80){
            System.out.print("Your score is " + score + " or higher - B");
        }
        else if (score >= 70){
            System.out.print("Your score is " + score + " or higher - C");
        }
        else {
            System.out.print("Need to retake");
        }
    }
}
