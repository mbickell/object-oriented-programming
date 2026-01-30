public class Utils {
  public static int generateRandomNumber(int lowerLimit, int upperLimit) {
    return (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
  }

  public static Car carFactory(String brand, String model) {
    int gasLevel = Utils.generateRandomNumber(1, 100);
    int tyreCount = Utils.generateRandomNumber(0, 4);
    return new Car(gasLevel, brand, model, tyreCount);
  }
}
