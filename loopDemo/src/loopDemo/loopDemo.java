package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// FOR LOOP
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti...");
		// WHILE LOOP
		int a = 1;
		
		while (a<10) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("While dongusu bitti");
		
		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j+=1;
		} while (j<10);
		
		System.out.println("Do-While dongusu bitti...");

	}

}
