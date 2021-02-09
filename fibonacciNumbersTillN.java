import java.util.*;

public class  fibonacciNumbersTillN{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(firstNumber);
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            
        }
    }
}