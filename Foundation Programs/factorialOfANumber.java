import java.util.*;
public class factorialOfANumber {
	public static void main(String[] arg) {
	Scanner scn = new Scanner(System.in);
	int number = scn.nextInt();
	int fact = 1;
	for(int i = 1; i <= number; i++) {
		fact *= i;  
	}
	System.out.println(fact);
}
}
