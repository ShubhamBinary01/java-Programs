import java.util.*;

public class benjaminBulbsProblem{

public static void main(String[] args) {
  
  Scanner scn = new Scanner(System.in);
  int numberOfBulbs = scn.nextInt();
  for(int fluctuation = 1; fluctuation * fluctuation <= numberOfBulbs; fluctuation++){
          System.out.println(fluctuation * fluctuation);
  }
 }
}