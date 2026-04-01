public class ElectricMotor implements Motor {
  @Override
  public void start() {
    System.out.println("Starting Electric Motor");
  }

  @Override
  public void stop() {
    System.out.println("Stopping Electric Motor");
  }

  @Override
  public String getType() {
    return "Electric Motor";
  }
}
