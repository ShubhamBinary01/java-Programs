import java.util.*;

public class rotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int rotateNumberByValue = scn.nextInt();
        int numberOfDigit = 0;
        int copyNumber = number;
        while (copyNumber != 0) {
            copyNumber /= 10;
            numberOfDigit++;
        }
        int divisor  = 1;
        int multiplier = 1;
        int resultantNumber = 0;
        rotateNumberByValue = rotateNumberByValue % numberOfDigit;
           if(rotateNumberByValue < 0) {
        	rotateNumberByValue = rotateNumberByValue + numberOfDigit;
        }
        for(int count = 1; count <= numberOfDigit; count++){
            if(count <= rotateNumberByValue){
                divisor = divisor * 10; 
            }
            else {
                multiplier = multiplier * 10;
            }
            int remainder = number % divisor;
            int quotient = number / divisor;
             resultantNumber = (remainder * multiplier) + quotient;
         
        }
           System.out.println(resultantNumber);

    }
}