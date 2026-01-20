import java.util.Arrays;
import java.util.Comparator;

public class Garage {
  private int size = 10;
  private Car[] cars = new Car[this.size];
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Mitsubishi", "Volkswagen", "Buick", "Mercedes Benz",
      "Audi", "Honda" };
  private String[] models = { "Octavia", "Gladiator", "A5", "Rio", "Mirage G4", "Golf R", "Enclave", "E-Class Wagon",
      "RS6 Avant", "Prologue" };

  public Garage(int size) {
    this.size = size;

    for (int i = 0; i < this.size; i++) {
      int carBrandIndex = (int) this.generateRandomNumber(0, 9);

      this.cars[i] = carFactory(this.brands[carBrandIndex], this.models[carBrandIndex]);
    }

    this.sortCars(this.cars);
  }

  private double generateRandomNumber(int lowerLimit, int upperLimit) {
    return Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit;
  }

  private Car carFactory(String brand, String model) {
    return new Car((int) (generateRandomNumber(1, 100)), brand, model);
  }

  private void sortCars(Car[] cars) {
    Arrays.sort(cars, Comparator.comparing(Car::getGasolineLevel));
  }

  public void printCars() {
    System.out.println("Gas level of: ");

    for (int i = 0; i < this.cars.length; i++) {
      System.out.println(
          "Car " + (i + 1) + " " + this.cars[i].getBrand() + " " + this.cars[i].getModel() + ": "
              + this.cars[i].getGasolineLevel() + "%");
    }
  }
}
