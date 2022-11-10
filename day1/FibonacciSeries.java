package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 6;
		int firstNum = 0;
		int secNum = 1;
		int sum;

		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <= range; i++) { // 1, 1,11,1,0,
			sum = firstNum + secNum; //0+1
			firstNum = secNum; //1
			secNum = sum;
			System.out.println(sum);

		}

	}

}
