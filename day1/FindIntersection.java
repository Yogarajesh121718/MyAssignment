package week1.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };

		int[] data1 = { 1, 2, 8, 4, 9, 7 };
		Arrays.sort(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data1.length; j++) {

				if (data[i] == data1[j]) {
					System.out.println(data[i]);
					// System.out.println(b[i]);
				}
			}
		}
	}
}
