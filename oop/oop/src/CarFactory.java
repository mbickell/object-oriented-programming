public class CarFactory {
  private String[] brands = { "Skoda", "Jeep", "Audi", "Kia", "Lexus", "Renault", "Buick", "Genesis",
      "Audi", "Dodge" };
  private String[] models = { "Octavia", "Recon", "A5", "Rio", "GX", "Clio", "Enclave", "G90",
      "A7", "Hornet" };

  public GasCar generateCar(String brand, String model, int tyreCount) {
    int gasLevel = Utils.generateRandomNumber(1, 100);
    return new GasCar(gasLevel, brand, model, tyreCount);
  }

  public GasCar generateCar() {
    int carBrandIndex = Utils.generateRandomNumber(0, 9);
    int tyreCount = Utils.generateRandomNumber(0, 4);
    // EngineType[] engineTypeArr = EngineType.values();
    // int engineTypeIndex = Utils.generateRandomNumber(0, engineTypeArr.length -
    // 1);

    GasCar car = this.generateCar(this.brands[carBrandIndex], this.models[carBrandIndex], tyreCount);
    return car;
  }
}
