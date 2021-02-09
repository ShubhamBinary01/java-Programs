import java.util.*;

public class countDigitsInANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countDigit = 0;
        while(n != 0){
            n /= 10;
            countDigit++;
        }
        System.out.println(countDigit);
    }
}