public class Main {
    public static void main(String[] args) {
        // Pay: 9.5 × 4.5 − 2.5 × 3
        double pay = 9.5 * 4.5 - 2.5 * 3;

        // Payda: 45.5 − 3.5
        double payda = 45.5 - 3.5;

        // Payı paydaya bölüyoruz
        double sonuc = pay / payda;

        // Sonucu 4 ondalık basamakla ekrana yazdırıyoruz
        System.out.printf("Sonuç = %.4f%n", sonuc);
    }
}
