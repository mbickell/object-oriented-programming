public class CarFactory {
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Lexus", "Renault", "Buick", "Genesis",
      "Audi", "Dodge" };
  private String[] models = { "Octavia", "Recon", "A5", "Rio", "GX", "Clio", "Enclave", "G90",
      "A7", "Hornet" };

  public Car generateCar(String brand, String model, int tyreCount, Car.EngineType engineType) {
    int gasLevel = Utils.generateRandomNumber(1, 100);
    return new Car(gasLevel, brand, model, tyreCount, engineType);
  }

  public Car generateCar() {
    int carBrandIndex = Utils.generateRandomNumber(0, 9);
    int tyreCount = Utils.generateRandomNumber(0, 4);
    Car.EngineType[] engineTypeArr = Car.EngineType.values();
    int engineTypeIndex = Utils.generateRandomNumber(0, engineTypeArr.length - 1);

    Car car = this.generateCar(this.brands[carBrandIndex], this.models[carBrandIndex], tyreCount,
        engineTypeArr[engineTypeIndex]);
    return car;
  }
}
