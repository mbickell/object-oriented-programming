public class GaragePrinter {
  public void printCars(Garage garage) {
    if (garage.getCarCount() == 0) {
      System.out.println("No cars");
    } else {
      String tableTop = String.format("%-10s %-10s %-10s %-10s %-10s %-15s %-20s %-10s \n", "Number", "Brand", "model",
          "Energy",
          "Tyres", "Engine Type", "Engine Running", "Max Height");

      System.out.println(tableTop);
      int i = 1;

      for (Car car : garage.getCars()) {
        String message = String.format("%-10d %-10s %-10s %-10s %-10d %-15s %-20s", i,
            car.getBrand(), car.getModel(),
            car.getEnergyLevel() + "%", car.getTyreCount(), car.getEngineType(), car.getEngineStatus());

        if (car instanceof FlyingCar) {
          message += String.format(" %-10.2f", ((FlyingCar) car).getMaxHeight());
        }

        System.out.println(message);
        i++;
      }
    }
  }
}
