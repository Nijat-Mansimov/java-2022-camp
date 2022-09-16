package multiDimensionalArrayDemo;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Uşak";
		sehirler[1][1] = "İzmir";
		sehirler[1][2] = "Kars";
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Nevşehir";
		sehirler[2][2] = "Tunceli";
		
		
		for(int i = 0;i<3;i++) {
			for(int j = 0; j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-----------------");
		}

	}

}
