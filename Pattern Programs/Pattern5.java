import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int space = number/2;
        int star = 1;
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= space; column++){
                System.out.print("\t");
            }
            for(int column = 1; column <= star; column++){
                System.out.print("*\t");
            }
            if(row <= number/2) {
            space--;
            star += 2;
            }
            else {
            	space++;
            	star -= 2;
            }
            
            System.out.println("");
        }
    }
}