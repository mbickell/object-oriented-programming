import java.util.Arrays;
import java.util.Comparator;

public class App {
  public static void main(String[] args) throws Exception {
    // int[] carGasolineLevels = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 54, 15,
    // 56, 87 };
    // Car test = new Car(45, "Hyundai", "i20");

    Car[] cars = {
        new Car((int) (Math.random() * 101), "Skoda", "Octavia"),
        new Car((int) (Math.random() * 101), "Jeep", "Gladiator"),
        new Car((int) (Math.random() * 101), "Adui", "A5"),
        new Car((int) (Math.random() * 101), "Kia", "Rio"),
        new Car((int) (Math.random() * 101), "Mitsubishi", "Mirage G4"),
        new Car((int) (Math.random() * 101), "Volkswagen", "Golf R"),
        new Car((int) (Math.random() * 101), "Buick", "Enclave"),
        new Car((int) (Math.random() * 101), "Mercedes Benz", "E-Class Wagon"),
        new Car((int) (Math.random() * 101), "Audi", "RS6 Avant"),
        new Car((int) (Math.random() * 101), "Honda", "Prologue"),
    };

    // Arrays.sort(cars, Comparator.comparing(Car::getGasolineLevel));
    Arrays.sort(cars, (Car car1, Car car2) -> {
      if (car1.getGasolineLevel() < car2.getGasolineLevel())
        return -1;
      if (car1.getGasolineLevel() > car2.getGasolineLevel())
        return 1;

      return 0;
    });

    System.out.println("Gas level of: ");

    for (int i = 0; i < cars.length; i++) {
      System.out.println(
          cars[i].getBrand() + " " + cars[i].getModel() + ": " + cars[i].getGasolineLevel() + "%");
    }
  }
}
