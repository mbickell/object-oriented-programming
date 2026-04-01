public class ConsoleDisplay implements GarageDisplay {
  @Override
  public void show(Garage garage) {
    if (garage.getCarCount() == 0) {
      System.out.println("No cars");
    } else {
      String tableTop = String.format("%-10s %-10s %-10s %-10s %-10s %-15s %-20s \n", "Number", "Brand", "model",
          "Energy",
          "Tyres", "Engine Type", "Engine Running");

      System.out.println(tableTop);
      int i = 1;

      for (Car car : garage.getCars()) {
        displayCar(car, i);
        i++;
      }
    }
  }

  private void displayCar(Car car, int index) {
    String message = String.format("%-10d %-10s %-10s %-10s %-10d %-15s %-20s", index,
        car.getBrand(), car.getModel(),
        car.getEnergyLevel() + "%", car.getTyreCount(), car.getEngineType(), car.getEngineStatus());

    System.out.println(message);
  }
}
