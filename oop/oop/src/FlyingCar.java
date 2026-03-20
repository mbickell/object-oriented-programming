public class FlyingCar extends Car {
  public FlyingCar() {
    this(0, "No brand", "No model", 0);
  }

  public FlyingCar(int energyLevel, String brand, String model, int tyreCount) {
    super(energyLevel, brand, model, tyreCount, EngineType.FLYING);
  }

  @Override
  public void startEngine() {
    super.startEngine();
    System.out.println("Starting flying engine (wub wub wub)");
  }

  @Override
  public void stopEngine() {
    super.stopEngine();
    System.out.println("Stopping flying engine");
  }
}
