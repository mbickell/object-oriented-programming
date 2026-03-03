public class GaragePrinter {
  public void printCars(Garage garage) {
    if (garage.getCarCount() == 0) {
      System.out.println("No cars");
    } else {
      System.out.println("Number\t\tBrand\t\tModel\t\tEnergy\t\tTyres\t\tEngine Type\t\t");

      for (int i = 0; i < garage.getCars().size(); i++) {
        Car currentCar = garage.getCars().get(i);
        String message = (i + 1) + "\t\t" + currentCar.getBrand() + "\t\t" + currentCar.getModel() + "\t\t"
            + currentCar.getEnergyLevel() + "%\t\t" + currentCar.getTyreCount() + "\t\t" + currentCar.getEngineType();

        System.out.println(message);
      }
    }
  }
}
