import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int number = scn.nextInt();
       int totalStar = number + 1;
       int totalSpace = 1;
       for(int row = 1; row <= number; row++) {
    	   for(int column = 1; column <= totalStar/2; column++) {
    		   System.out.print("*\t");
    	   }
    	   for(int column = 1; column <= totalSpace; column++) {
    		   System.out.print("\t");
    	   }
    	   for(int column = totalStar/2; column < totalStar; column++) {
    		   System.out.print("*\t");
    	   }
    	   if(row <= number/2) {
    		   totalStar -= 2;
    		   totalSpace += 2;
    	   }
    	   else {
    		   totalStar += 2;
    		   totalSpace -= 2;
    	   }
    	   System.out.println("");
       }
       

    }
}