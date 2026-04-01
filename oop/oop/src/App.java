public class App {
  public static void main(String[] args) throws Exception {
    Garage garage = new Garage();
    GarageSeeder seeder = new DemoSeeder();
    GarageDisplay display = new ConsoleDisplay();

    seeder.seed(garage);
    display.show(garage);
  }
}
