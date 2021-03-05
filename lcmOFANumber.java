import java.util.*;
public class lcmOFANumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int max = n1 > n2 ? n1 : n2;
		while(true) {
			if((max % n1 == 0) && (max % n2 == 0)) {
				System.out.println(max);
				break;
			}
			++max;
		}
	
	}
}
