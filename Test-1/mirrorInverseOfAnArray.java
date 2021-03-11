//1.Take an input N, the size of array.
//2.Take N more inputs and store that in an array.
//
//Write a function that reverses the array. Print the values in reversed array,if
//is Mirror-inverse of array print true else print false.
//
//Example(To be used only for expected output):
//Input:
//5
//3 4 2 0 1
//
//Output:
//3 4 2 0 1
//true
//
//Input:
//4
//1 2 3 0
//
//Output:
//3 0 1 2
//false

import java.util.*;
public class mirrorInverseOfAnArray {

	public static void main(String[] args) {
		
        Scanner scn= new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        reverse(arr);
        System.out.println();
        System.out.print(isMirror(arr));
    }
    public static boolean isMirror(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[a[i]] == i){
                return true;
            }
        }
        return false;
    }
    public static void reverse(int[] a){
        int[] inv = new int[a.length];
        for(int k = 0; k < a.length; k++){
            int val = a[k];
            inv[val] = k;
        }
        for(int i = 0; i< inv.length; i++){
            System.out.print(inv[i] + " ");
        }
    }

}
