package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int cal = 0, remd, orig;

		orig = 150;

		int t = orig;
		while (t > 0) {
			remd = t % 10; // rm = 3;
			t = t / 10; // or = 15;

			cal = cal + (remd * remd * remd);

		}

		if (cal == orig) {
			System.out.println("armstrong  number ");
		} else {
			System.out.println("armstrong  number is not ");
		}

	}

}
