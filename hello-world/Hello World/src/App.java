public class App {
  public static void main(String[] args) throws Exception {
    Garage garage = new Garage(10);

    garage.printCars();

    System.out.println(garage.getCars().get(0).getEngineStatus());
    garage.getCars().get(0).startEngine();
    System.out.println(garage.getCars().get(0).getEngineStatus());
    garage.getCars().get(0).accelerate();
    System.out.println(garage.getCars().get(0).getSpeed());
  }
}
