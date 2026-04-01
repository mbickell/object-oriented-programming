public class DemoSeeder implements GarageSeeder {
  @Override
  public void seed(Garage garage) {
    for (int i = 0; i < 10; i++) {
      Car car = CarFactory.generateCar();
      garage.addCar(car);
    }

    for (int i = 0; i < 5; i++) {
      garage.getCars().get(i).startEngine();
    }
  }
}
