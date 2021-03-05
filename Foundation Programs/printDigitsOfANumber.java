import java.util.*;

public class printDigitsOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int numberOfDigit = 0;
        while(num != 0){
            num /= 10;
            numberOfDigit++;
        }
        int div = (int)Math.pow(10, numberOfDigit - 1);
        int ans = 0;
        while(div != 0){
            ans  = n / div;
            System.out.println(ans);
             n %= div;
            div /= 10;
        }
    }
}