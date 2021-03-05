import java.util.*;
public class armstrongNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = n;
//		get digit
		int check = 0;
		while(n != 0) {
			int d = n % 10;
			n /= 10;
			check += (d*d*d);
		}
		if(num == check) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
