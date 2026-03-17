public class HybridCar extends Car {
  public HybridCar() {
    this(0, "No brand", "No model", 0);
  }

  public HybridCar(int energyLevel, String brand, String model, int tyreCount) {
    super(energyLevel, brand, model, tyreCount, EngineType.HYBRID);
  }

  @Override
  public void startEngine() {
    this.setEngineRunning(true);

    System.out.println("Starting hybrid engine (vrr vroom)");
  }

  @Override
  public void stopEngine() {
    this.setEngineRunning(false);

    System.out.println("Stopping hybrid engine");
  }
}
