public class App {
  public static void main(String[] args) throws Exception {
    Garage garage = new Garage();

    createDemoCars(garage);

    for (int i = 0; i < 5; i++) {
      garage.getCars().get(i).startEngine();
    }

    displayGarageIngo(garage);
  }

  public static void createDemoCars(Garage garage) {
    CarFactory carFactory = new CarFactory();

    for (int i = 0; i < 10; i++) {
      Car car = carFactory.generateCar();
      garage.addCar(car);
    }
  }

  public static void displayGarageIngo(Garage garage) {
    GaragePrinter garagePrinter = new GaragePrinter();
    garagePrinter.printCars(garage);
  }
}
