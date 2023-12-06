package InterviewQuestion;

public class ArmStrong {

	public static boolean IsArmstong(int number) {
		int sum = 0;
		for (int temp = number; temp > 0; temp /= 10) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
		}
		return sum == number;
	}

	public static void main(String[] args) {
		int number = 153;
		boolean IsArmstong = IsArmstong(number);
		if (IsArmstong) {
			System.out.println("+Ve");
		} else {
			System.out.println("-Ve");
		}

	}

}
