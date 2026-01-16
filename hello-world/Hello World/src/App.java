import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] carGasolineLevels = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 54, 15, 56, 87 };

        Arrays.sort(carGasolineLevels);

        for (int i = 0; i < carGasolineLevels.length; i++) {
            System.out.println("Gas level of car " + (i + 1) + " " + carGasolineLevels[i] + "%");
        }
    }
}
