import java.util.Scanner;

public class Wk09_TestingQuiz {
    public static void main(String[] args) {
        for(int i = 0; i < 30; i++){
            System.out.println(i + " ");
            if(i % 2 == 0){
                i += 2;
            } else if(i % 3 == 0){
                i++;
            } else if(i % 5 == 0){
                i += 9;
            }
        }
    }
}
