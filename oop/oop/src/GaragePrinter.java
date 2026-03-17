public class GaragePrinter {
  public void printCars(Garage garage) {
    if (garage.getCarCount() == 0) {
      System.out.println("No cars");
    } else {
      System.out.println("Number\t\tBrand\t\tModel\t\tEnergy\t\tTyres\t\tEngine Type\t\t");

      int i = 1;

      for (Car car : garage.getCars()) {
        String message = String.format("%d\t\t%s\t\t%s\t\t%d%%\t\t%d\t\t%s", i,
            car.getBrand(), car.getModel(),
            car.getEnergyLevel(), car.getTyreCount(), car.getEngineType());

        System.out.println(message);
        i++;
      }
    }
  }
}
