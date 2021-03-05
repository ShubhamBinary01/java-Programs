import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= row; column++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
      

    }
}