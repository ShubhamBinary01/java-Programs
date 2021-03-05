import java.util.*;

public class inverseOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalPlace = 1;
        int inverseNumber = 0;
        while (number != 0) {
            int originalNumber = number % 10;
            int inversePlace = originalNumber;
            int inverseDigit = originalPlace;
            inverseNumber = inverseNumber + (inverseDigit * (int)Math.pow(10, inversePlace -1));
            originalPlace++;
            number /= 10;

        }
        System.out.println(inverseNumber);
    }
}