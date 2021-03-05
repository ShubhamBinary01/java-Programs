import java.util.*;
public class gcdOfThreeNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2  = scn.nextInt();
		int n3  = scn.nextInt();
		
		int gcd = 0;
	for(int i = 1; i <= n1 && i<= n2 && i <= n3; i++) {
		if((n1 % i == 0) && (n2 % i == 0) && (n2 % i == 0)) {
			gcd = i;
		}
	}
	System.out.println(gcd);
	}
}
