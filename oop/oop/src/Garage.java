import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Garage {
  private List<GasCar> cars;

  public Garage() {
    this(new ArrayList<GasCar>());
  }

  public Garage(List<GasCar> cars) {
    this.cars = cars;

    this.sortCars();
  }

  private void sortCars() {
    Collections.sort(this.cars, Comparator.comparing(GasCar::getEnergyLevel));
  }

  public void addCar(GasCar car) {
    cars.add(car);
  }

  public boolean removeCar(GasCar car) {
    return cars.remove(car);
  }

  public List<GasCar> getCars() {
    return Collections.unmodifiableList(this.cars);
  }

  public int getCarCount() {
    return this.cars.size();
  }

  public int getTotalTyres() {
    int totalTyres = 0;

    for (GasCar car : this.cars) {
      totalTyres += car.getTyreCount();
    }

    return totalTyres;
  }
}
