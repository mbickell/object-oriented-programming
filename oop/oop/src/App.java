import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    Garage garage = createDemoCars();

    displayGarageIngo(garage);
  }

  public static Garage createDemoCars() {
    List<Car> cars = new ArrayList<Car>();
    CarFactory carFactory = new CarFactory();

    for (int i = 0; i <= 10; i++) {
      cars.add(carFactory.generateCar());
    }

    return new Garage(cars);
  }

  public static void displayGarageIngo(Garage garage) {
    GaragePrinter garagePrinter = new GaragePrinter();
    garagePrinter.printCars(garage);
  }
}
