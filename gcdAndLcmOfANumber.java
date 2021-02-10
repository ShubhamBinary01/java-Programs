import java.util.*;
    
    public class gcdAndLcmOfANumber{
    
    public static void main(String[] args) {
    	   Scanner scn = new Scanner(System.in);
    	          int firstNumber = scn.nextInt();
    	          int secondNumber = scn.nextInt();
    	          int copyFirstNumber = firstNumber;
    	          int copySecondNumber = secondNumber;
    	          while(firstNumber % secondNumber != 0){
    	              int remainder = firstNumber % secondNumber;
    	               firstNumber = secondNumber;
    	               secondNumber = remainder;
    	          }
    	          int gcd = secondNumber;
    	          int lcm = (copyFirstNumber * copySecondNumber) / gcd;
    	          System.out.println(gcd);
    	          System.out.println(lcm);
    	      }
    	     }
    	    