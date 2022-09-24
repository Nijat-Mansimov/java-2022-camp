package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -5;
		boolean isPrime = true;

			if(number == 1) {
				System.out.println("Asal değil");
				return;
			}
			
			if(number < 1) {
				System.out.println("Geçersiz sayı. ");
			}

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
				} 
				

			}
			
			if(isPrime) {
				System.out.println("Asaldır");
			}
			else
			{
				System.out.println("Asal değildir");
			}

	}

}
