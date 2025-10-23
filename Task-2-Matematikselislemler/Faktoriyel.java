public class Main {
    public static void main(String[] args) {
        int n = 5;           // Faktoriyelini hesaplayacagimiz sayi
        int faktoriyel = 1;  // Baslangic degeri (carpma islemi icin 1)

        System.out.println(n + "! hesabi:");

        // 5 x 4 x 3 x 2 x 1 seklinde carpma islemi
        for (int i = n; i >= 1; i--) {
            faktoriyel *= i;  // faktoriyel = faktoriyel * i;

            // Ara adimi goster
            System.out.println("Adim " + (n - i + 1) + ": " + i + " ile carpildi -> Sonuc: " + faktoriyel);
        }

        System.out.println("---------------------");
        System.out.println(n + "! = " + faktoriyel);
    }
}
