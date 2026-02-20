import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    List<Car> cars = new ArrayList<Car>();
    CarFactory carFactory = new CarFactory();
    GaragePrinter garagePrinter = new GaragePrinter();

    for (int i = 0; i < 10; i++) {
      cars.add(carFactory.generateCar());
    }

    Garage garage = new Garage(cars);

    garagePrinter.printCars(garage);

    System.out.println(garage.getTotalTyres());

    System.out.println(garage.getCars().get(0).getEngineStatus());
    garage.getCars().get(0).startEngine();
    System.out.println(garage.getCars().get(0).getEngineStatus());
    garage.getCars().get(0).accelerate();
    System.out.println(garage.getCars().get(0).getSpeed());

    System.out.println(Math.sqrt(garage.getCarCount()));

    garage.removeCar(garage.getCars().get(1));

    garagePrinter.printCars(garage);
  }
}
