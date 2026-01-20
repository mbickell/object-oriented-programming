public class Car {
    private int gasolineLevel;
    private String brand;
    private String model;

    public Car(int gasolineLevel, String brand, String model) {
        this.gasolineLevel = gasolineLevel;
        this.brand = brand;
        this.model = model;
    }

    public int getGasolineLevel() {
        return this.gasolineLevel;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}
