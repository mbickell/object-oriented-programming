public class HybridMotor implements Motor {
  @Override
  public void start() {
    System.out.println("Starting Hybrid Motor");
  }

  @Override
  public void stop() {
    System.out.println("Stopping Hybrid Motor");
  }

  @Override
  public String getType() {
    return "Hybrid Motor";
  }
}
