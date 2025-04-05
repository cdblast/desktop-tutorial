public class Wk07_NestedLoops {
    public static void main(String[] args) {
        int row = 4;
        int col = 5;

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col ; c++){
                System.out.println("*");
            }
            System.out.println();

            col = 4;
/*            for(int r = 0; r < row; r++){
                for (???){System.out.println("+");
            }else{
                    System.out.print("$");
                }*/
        }
    }
}
