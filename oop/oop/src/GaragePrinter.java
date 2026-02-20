public class GaragePrinter {
  public void printCars(Garage garage) {
    if (garage.getCarCount() == 0) {
      System.out.println("No cars");
    } else {
      System.out.println("Number\t\tBrand\t\tModel\t\tGas\t\tTyres\t\t");

      for (int i = 0; i < garage.getCars().size(); i++) {
        Car currentCar = garage.getCars().get(i);
        String message = (i + 1) + "\t\t" + currentCar.getBrand() + "\t\t" + currentCar.getModel() + "\t\t"
            + currentCar.getGasolineLevel() + "%\t\t" + currentCar.getTyreCount();

        System.out.println(message);
      }
    }
  }
}
