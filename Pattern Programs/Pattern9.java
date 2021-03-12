import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= number; column++) {
            if((row + column) == (number + 1) || (row == column)){
                System.out.print("*\t");
            } 
            else{
                System.out.print("\t");
            }
        }
        System.out.println("");
        }
    }
}