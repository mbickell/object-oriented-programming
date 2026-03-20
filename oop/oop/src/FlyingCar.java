public class FlyingCar extends GasCar {
  float maxHeight;

  public FlyingCar() {
    this(0, "No brand", "No model", 0, 100f);
  }

  public FlyingCar(int energyLevel, String brand, String model, int tyreCount, float maxHeight) {
    super(energyLevel, brand, model, tyreCount);

    this.maxHeight = maxHeight;
  }

  public float getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(float maxHeight) {
    this.maxHeight = maxHeight;
  }
}
