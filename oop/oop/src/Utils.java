public class Utils {
  public static int generateRandomNumber(int lowerLimit, int upperLimit) {
    return (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
  }
}
