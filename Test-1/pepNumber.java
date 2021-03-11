//1. There is a given array of size N.
//2. Array have N distinct elements.
//3. Question is all about to print PEP NUMBER, where PEP NUMBER is defined as 
//"The difference of 2nd max and 2nd min from array."
//4. Note : Expectation of Solving the problem in single iteration.
//
//Input : 
//7
//4 15 13 9 2 7 8
//Output : 
//9

import java.util.*;
public class pepNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > fmax){
                fmax = arr[i];
            }
             if(arr[i] < fmin){
                fmin = arr[i];
            }
            
        }
          for(int i = 0; i < arr.length; i++){
           if(arr[i] > smax && arr[i] != fmax){
                smax = arr[i];
            }
            if(arr[i] < smin && arr[i] != fmin){
                smin = arr[i];
            }
            
        }
          
        int pepnumber = smax - smin;
        System.out.println(pepnumber);
        

	}

}
