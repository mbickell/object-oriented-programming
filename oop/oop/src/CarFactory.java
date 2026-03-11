public class CarFactory {
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Lexus", "Renault", "Buick", "Genesis",
      "Audi", "Dodge" };
  private String[] models = { "Octavia", "Recon", "A5", "Rio", "GX", "Clio", "Enclave", "G90",
      "A7", "Hornet" };

  public Car generateCar(String brand, String model, int tyreCount) {
    int gasLevel = Utils.generateRandomNumber(1, 100);
    int randomCarSelector = Utils.generateRandomNumber(1, 3);

    switch (randomCarSelector) {
      case 1:
        return new GasCar(gasLevel, brand, model, tyreCount);
      case 2:
        return new HybridCar(gasLevel, brand, model, tyreCount);
      case 3:
        return new ElectricCar(gasLevel, brand, model, tyreCount);
      default:
        return new GasCar(gasLevel, brand, model, tyreCount);
    }
  }

  public Car generateCar() {
    int carBrandIndex = Utils.generateRandomNumber(0, 9);
    int tyreCount = Utils.generateRandomNumber(0, 4);

    Car car = this.generateCar(this.brands[carBrandIndex], this.models[carBrandIndex], tyreCount);
    return car;
  }
}
