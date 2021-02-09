import java.util.*;

public class reverseOfANumber {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int reverse = 0;
       while(number != 0){
           reverse = number % 10;
           System.out.println(reverse);
           number /= 10;
       }
    }
}