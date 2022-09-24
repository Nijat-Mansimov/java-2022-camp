package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 7;
		boolean isTrue = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				isTrue = true;
				break;
			}

		}
		if (isTrue) {
			System.out.println("Sayı mevcut");

		} else {
			System.out.println("Sayı yok");

		}
	}

}
