public class App {
  public static void main(String[] args) throws Exception {
    Garage garage = new Garage();
    GarageSeeder seeder = new DemoSeeder();

    seeder.seedGarage(garage);

    for (int i = 0; i < 5; i++) {
      garage.getCars().get(i).startEngine();
    }

    displayGarageIngo(garage);
  }

  public static void displayGarageIngo(Garage garage) {
    GaragePrinter garagePrinter = new GaragePrinter();
    garagePrinter.printCars(garage);
  }
}
