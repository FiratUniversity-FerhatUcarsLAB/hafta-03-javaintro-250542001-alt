public class KuvvetTablosu {
    public static void main(String[] args) {
        // Başlık kısmı
        System.out.println("a\t a^2\t a^3");
        System.out.println("-----------------");
        
        // Döngüyle 1’den 5’e kadar değerleri yazdırıyoruz
        for (int a = 1; a <= 5; a++) {
            System.out.println(a + "\t " + (a * a) + "\t " + (a * a * a));
        }
    }
}
