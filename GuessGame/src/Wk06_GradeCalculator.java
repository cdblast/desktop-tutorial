import java.util.Scanner;

public class Wk06_GradeCalculator {
    public static void main(String[] args) {
        int studentCount, math, phys, chem, bio, eng, studentSum, classSum = 0;
        double studentPercent, classPercent;

        Scanner scanner = new Scanner(System.in);

        // ask how many students.
        System.out.print("How many students are in the class? ");
        studentCount = scanner.nextInt();
        math = 0;
        phys = 0;
        chem = 0;
        bio = 0;
        eng = 0;
        if(studentCount > 0){
            for(int i = 0; i < studentCount; i++){
                studentSum = 0;
                System.out.println("Enter grades for student " + (i + 1));

                System.out.print("Enter grade for Math: ");
                math = scanner.nextInt();
                System.out.print("Enter grade for Physics: ");
                phys = scanner.nextInt();
                System.out.print("Enter grade for Chemistry: ");
                chem = scanner.nextInt();
                System.out.print("Enter grade for Biology: ");
                bio = scanner.nextInt();
                System.out.print("Enter grade for English: ");
                eng = scanner.nextInt();
                studentSum = math + phys + chem + bio + eng;

                studentPercent = studentSum / 5.0;
                classSum += (int) studentPercent;

                System.out.println("Your percentage is: " + (int)Math.round(studentPercent) + "%");

                if(studentPercent >= 90){
                    System.out.println("Your grade is A.");
                }else if(studentPercent >= 80){
                    System.out.println("Your grade is B.");
                }else if(studentPercent >= 70){
                    System.out.println("Your grade is C.");
                }else if(studentPercent >= 60){
                    System.out.println("Your grade is D.");
                }else {
                    System.out.println("Your grade is F.");
                }
            }
            System.out.println("The average student grade is " + (classSum / studentCount) + "%");
        }else{
            System.out.println("The average student grade is 0%");
        }
        System.out.println("Grading complete!");
    }
}
