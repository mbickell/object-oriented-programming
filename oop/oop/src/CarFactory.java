public class CarFactory {
  static String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Lexus", "Renault", "Buick", "Genesis",
      "Audi", "Dodge" };
  static String[] models = { "Octavia", "Recon", "A5", "Rio", "GX", "Clio", "Enclave", "G90",
      "A7", "Hornet" };

  static Car generateCar(String brand, String model, int tyreCount) {
    int gasLevel = Utils.generateRandomNumber(1, 100);
    int randomCarSelector = Utils.generateRandomNumber(1, 3);

    switch (randomCarSelector) {
      case 1:
        return new Car(gasLevel, brand, model, tyreCount, new GasMotor());
      case 2:
        return new Car(gasLevel, brand, model, tyreCount, new ElectricMotor());
      case 3:
        return new Car(gasLevel, brand, model, tyreCount, new HybridMotor());
      default:
        return new Car(gasLevel, brand, model, tyreCount, new GasMotor());
    }
  }

  static Car generateCar() {
    int carBrandIndex = Utils.generateRandomNumber(0, 9);
    int tyreCount = Utils.generateRandomNumber(0, 4);

    Car car = generateCar(brands[carBrandIndex], models[carBrandIndex], tyreCount);
    return car;
  }
}
