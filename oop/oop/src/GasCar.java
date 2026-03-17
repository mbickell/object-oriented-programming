public class GasCar extends Car {
  public GasCar() {
    this(0, "No brand", "No model", 0);
  }

  public GasCar(int energyLevel, String brand, String model, int tyreCount) {
    super(energyLevel, brand, model, tyreCount, EngineType.GAS);
  }

  @Override
  public void startEngine() {
    this.setEngineRunning(true);

    System.out.println("Starting gas engine (vroom)");
  }

  @Override
  public void stopEngine() {
    this.setEngineRunning(false);

    System.out.println("Stopping gas engine");
  }
}
