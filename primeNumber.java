import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
		for(int i = 1; i <= t; i++) {
				int n = scn.nextInt();
				int div = 2;
				while(div * div <= n) {
					if(n % div == 0) {
						break;
					}
					div++;
				}
				if(div * div > n) {
					System.out.println("prime");
				}
				else {
					System.out.println("not prime");
				}
			}
		}
	}


