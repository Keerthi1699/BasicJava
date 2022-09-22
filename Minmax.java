package basic;

import java.lang.reflect.Array;

public class Minmax {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int max = 0;
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("maximum value " +max);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("minimum value " +min);
	}

}
