import java.util.*;

public class primeFactorisationOfANumber{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    for(int div = 2; div <= number; div++){
        while(number % div == 0){
            System.out.print(div+" ");
            number = number / div;
        }
    }
 
 }
}