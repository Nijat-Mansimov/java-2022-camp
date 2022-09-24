public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(sehirVer());

        int sayi = topla(5,7);
        System.out.println(sayi);

        int toplam = topla2(1,2,4,4,6,7);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Eklendi");

    }

    public static void guncelle(){
        System.out.println("Eklendi");

    }

    public static int topla(int a, int b){
        return a+b;

    }

    public static String sehirVer(){
        return "Ankara";

    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

}