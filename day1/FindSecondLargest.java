package week1.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		//1176432
		//2346711
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
//		System.out.println(data[4]);

	}

}
