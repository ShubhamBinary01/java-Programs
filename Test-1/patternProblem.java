//Identify the combination of printing star and space and print the pattern. (printing star and space is tab separated)
//
//Example (To be used only for expected output)
//Input : 
//5
//Output :
//*				*
//*	*		*	*
//*	*	*	*	*
//*	*		*	*
//*				*

import java.util.*;
public class patternProblem {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
	        int N = scn.nextInt();
	        int sp = N - 2;
	        int st = 1;
	        
	        for(int i = 1; i <= N; i++){
	        	
//	             print star
	            for(int j = 1; j <= st; j++){
	                System.out.print("*\t");
	            }
	            
//	             print space
	            for(int j = 1; j <= sp; j++){
	                System.out.print("\t");
	            }
	            
//	          	print star
	          for(int j = 1; j <= st; j++){
	        	  if(i == N/2 + 1 && j == st) {
	        		 continue;
	        	  }else {
	        		  System.out.print("*\t");
	        	  }
	                  
	            }
	          
//	             hit enter
	            System.out.println();
	            
//	             manage star and space
	            if(i <= N/2){
	                sp -= 2;
	                st++;
	            } 
	            else {
	                sp += 2;
	                st--;
	            }
	        }

	}

}