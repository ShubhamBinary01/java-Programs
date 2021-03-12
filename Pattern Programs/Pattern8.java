import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int number = scn.nextInt();
       for(int row = number; row >= 1; row--){
           for(int column = 1; column <= row; column++){
               if(column == row){      // or we can use if(row + column == number + 1){ System.out.print("*"); }
                   System.out.print("*");
               }
               else{
                   System.out.print("\t");
               }
           }
           System.out.println("");
       }

    }
}