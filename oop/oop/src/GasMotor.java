public class GasMotor implements Motor {
  @Override
  public void start() {
    System.out.println("Starting Gas Motor");
  }

  @Override
  public void stop() {
    System.out.println("Stopping Gas Motor");
  }

  @Override
  public String getType() {
    return "Gas Motor";
  }
}
