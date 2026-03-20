public class ElectricCar extends Car {
  public ElectricCar() {
    this(0, "No brand", "No model", 0);
  }

  public ElectricCar(int energyLevel, String brand, String model, int tyreCount) {
    super(energyLevel, brand, model, tyreCount, EngineType.ELECTRIC);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println("Starting electric engine (vrrrrrrr)");
  }

  @Override
  public void stopEngine() {
    super.stopEngine();
    System.out.println("Stopping electric engine");
  }
}
