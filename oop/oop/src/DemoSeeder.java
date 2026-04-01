public class DemoSeeder implements GarageSeeder {
  @Override
  public void seedGarage(Garage garage) {
    for (int i = 0; i < 10; i++) {
      Car car = CarFactory.generateCar();
      garage.addCar(car);
    }
  }
}
