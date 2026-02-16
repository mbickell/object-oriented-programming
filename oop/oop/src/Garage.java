import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Garage {
  private List<Car> cars;
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Lexus", "Renault", "Buick", "Genesis",
      "Audi", "Dodge" };
  private String[] models = { "Octavia", "Recon", "A5", "Rio", "GX", "Clio", "Enclave", "G90",
      "A7", "Hornet" };

  public Garage() {
    this(10);
  }

  public Garage(int size) {
    this.cars = new ArrayList<Car>(size);

    for (int i = 0; i < size; i++) {
      this.addCar();
    }

    this.sortCars();
  }

  private void sortCars() {
    Collections.sort(this.cars, Comparator.comparing(Car::getGasolineLevel));
  }

  public void printCars() {

    System.out.println("Number\t\tBrand\t\tModel\t\tGas\t\tTyres\t\t");

    for (int i = 0; i < this.cars.size(); i++) {
      Car currentCar = this.cars.get(i);
      String message = (i + 1) + "\t\t" + currentCar.getBrand() + "\t\t" + currentCar.getModel() + "\t\t"
          + currentCar.getGasolineLevel() + "%\t\t" + currentCar.getTyreCount();

      System.out.println(message);
    }
  }

  public void addCar() {
    int carBrandIndex = Utils.generateRandomNumber(0, 9);
    Car car = Utils.carFactory(this.brands[carBrandIndex], this.models[carBrandIndex]);
    cars.add(car);
  }

  public void addCar(String brand, String model) {
    cars.add(Utils.carFactory(brand, model));
  }

  public List<Car> getCars() {
    return this.cars;
  }

  public int getCarCount() {
    return this.cars.size();
  }

  public int getTotalTyres() {
    int totalTyres = 0;

    for (Car car : cars) {
      totalTyres += car.getTyreCount();
    }

    return totalTyres;
  }
}
