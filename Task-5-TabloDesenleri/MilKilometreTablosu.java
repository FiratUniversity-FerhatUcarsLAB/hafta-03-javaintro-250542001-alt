public class MilToKm {
    public static void main(String[] args) {
        System.out.println("Mil\tKilometre");
        System.out.println("-----------------");
        
        int[] miller = {1, 5, 10, 20, 50};
        
        for (int mil : miller) {
            double km = mil * 1.609;
            System.out.println(mil + "\t" + km);
        }
    }
}
