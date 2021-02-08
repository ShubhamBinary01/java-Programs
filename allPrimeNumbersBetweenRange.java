
import java.util.*;

public class allPrimeNumbersBetweenRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int range = low; range <= high; range++){
            int div = 2;
            while(div * div <= range){
                if(range % div == 0){
                    break;
                }
                div++;
            }
            if(div * div > range){
                System.out.println(range);
            }
         
        }

        
    }
}