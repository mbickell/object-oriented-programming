public class Car {
  private EngineType engineType;
  private int energyLevel;
  private String brand;
  private String model;
  private int tyreCount;
  private boolean isEngineRunning = false;
  private int speed = 0;

  public Car() {
    this(0, "No brand", "No model", 0, EngineType.GAS);
  }

  public Car(int energyLevel, String brand, String model, int tyreCount, EngineType engineType) {
    this.engineType = engineType;
    this.energyLevel = energyLevel >= 0 ? energyLevel : 0;
    this.brand = brand;
    this.model = model;
    this.tyreCount = tyreCount >= 0 ? tyreCount : 0;
  }

  public EngineType getEngineType() {
    return engineType;
  }

  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  public int getEnergyLevel() {
    return this.energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    if (energyLevel < 0) {
      this.energyLevel = 0;
    }

    this.energyLevel = energyLevel;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getEngineStatus() {
    return this.isEngineRunning ? "Engine is running" : "Engine is stopped";
  }

  public String getSpeed() {
    return this.speed + " km/h";
  }

  public int getTyreCount() {
    return this.tyreCount;
  }

  public void setTyreCount(int tyreCount) {
    if (tyreCount < 0) {
      this.tyreCount = 0;
    }

    this.tyreCount = tyreCount;
  }

  public void setEngineRunning(boolean isEngineRunning) {
    this.isEngineRunning = isEngineRunning;
  }

  public void startEngine() throws Exception {
    throw new Exception();
  }

  public void stopEngine() {
    this.isEngineRunning = false;
    this.speed = 0;
  }

  public String accelerate(int speed) {
    if (!this.isEngineRunning) {
      return "Engine is not running";
    }

    this.speed += speed;
    return "Car accelerating";
  }

  public String accelerate() {
    return this.accelerate(10);
  }

  public String brake() {
    if (!this.isEngineRunning) {
      return "Engine is not running";
    }

    this.speed = this.speed - 10 < 0 ? 0 : this.speed - 10;

    return "Car braking";
  }
}
