import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Garage {
  private int size = 10;
  private List<Car> cars = new ArrayList<Car>();
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Mitsubishi", "Volkswagen", "Buick", "Mercedes Benz",
      "Audi", "Honda" };
  private String[] models = { "Octavia", "Gladiator", "A5", "Rio", "Mirage G4", "Golf R", "Enclave", "E-Class Wagon",
      "RS6 Avant", "Prologue" };

  public Garage(int size) {
    this.size = size;

    for (int i = 0; i < this.size; i++) {
      int carBrandIndex = (int) this.generateRandomNumber(0, 9);

      cars.add(carFactory(this.brands[carBrandIndex], this.models[carBrandIndex]));
    }

    this.sortCars(this.cars);
  }

  private double generateRandomNumber(int lowerLimit, int upperLimit) {
    return Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit;
  }

  private Car carFactory(String brand, String model) {
    return new Car((int) (generateRandomNumber(1, 100)), brand, model);
  }

  private void sortCars(List<Car> cars) {
    Collections.sort(cars, Comparator.comparing(Car::getGasolineLevel));
  }

  public void printCars() {
    System.out.println("Gas level of: ");

    for (int i = 0; i < this.size; i++) {
      System.out.println(
          "Car " + (i + 1) + ": " + this.cars.get(i).getBrand() + " " + this.cars.get(i).getModel() + ": "
              + this.cars.get(i).getGasolineLevel() + "%");
    }
  }

  public void addCar() {
    this.size++;

    int carBrandIndex = (int) this.generateRandomNumber(0, 9);
    cars.add(carFactory(this.brands[carBrandIndex], this.models[carBrandIndex]));
  }
}
