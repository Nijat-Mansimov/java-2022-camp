package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 15;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}

		}
		if (total == number) {
			System.out.println("Mükemmel sayı");
		} else {
			System.out.println("Mükemmel sayı değil.");
	}
	}
}
