import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk08_FileReadingIntro {
    public static void main(String[] args) throws IOException {
/*        FileReader fr = new FileReader("Wk08_word.txt");*/
        FileReader fr = new FileReader("src/Wk08_word.txt");
        Scanner fin = new Scanner(fr);
        int count = 0;
        int dataCount = fin.nextInt();
/*        while(fin.hasNext()){*/
        for(int i =  0; i < dataCount; i++){
            System.out.println(fin.next());
            count++;
        }
        String s = fin.next();
        System.out.println(count + " data read");
        fr.close();

        FileReader fr2 = new FileReader("src/Wk08_Fir.data");
        Scanner fin2 = new Scanner(fr2);
        int intSum = 0;
        double doubleSum = 0.0;
        while (fin2.hasNext()){
            if(fin2.hasNextInt()){
                intSum += fin2.nextInt();
            } else if(fin2.hasNextDouble()){
                doubleSum += fin2.nextDouble();
            } else{
                System.out.println(fin2.next());
            }
        }
        System.out.println("Int sum: " + intSum);
        System.out.println("Double sum: " + doubleSum);

/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("Your input is " + word);*/
    }
}
