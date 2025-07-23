package week2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={2, 5, 7, 7, 5, 9, 2, 3};
		int lengthOfArray = num.length;
		System.out.println("The Length of array is: "+lengthOfArray);
		Arrays.sort(num);
		System.out.println("The Sorted Array is" + Arrays.toString(num));
		
		for(int i=0; i < lengthOfArray-1; i++) {
			
			if (num[i] == num[i+1]){							
				System.out.println(num[i]);
			}			
		//System.out.println("The Duplicate values are " + num[i]);
		}
	}
  	
}
