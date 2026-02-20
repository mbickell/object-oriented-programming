import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Garage {
  private List<Car> cars;

  public Garage() {
    this(new ArrayList<Car>());
  }

  public Garage(List<Car> cars) {
    this.cars = cars;

    this.sortCars();
  }

  private void sortCars() {
    Collections.sort(this.cars, Comparator.comparing(Car::getGasolineLevel));
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public boolean removeCar(Car car) {
    return cars.remove(car);
  }

  public List<Car> getCars() {
    return Collections.unmodifiableList(this.cars);
  }

  public int getCarCount() {
    return this.cars.size();
  }

  public int getTotalTyres() {
    int totalTyres = 0;

    for (Car car : this.cars) {
      totalTyres += car.getTyreCount();
    }

    return totalTyres;
  }
}
