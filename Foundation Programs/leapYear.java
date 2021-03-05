import java.util.*;
public class leapYear {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if((n % 4 == 0) || (n % 400 == 0) && (n % 100 != 0)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
}
