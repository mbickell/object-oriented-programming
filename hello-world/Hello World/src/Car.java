public class Car {
    private int gasolineLevel;
    private String brand;
    private String model;
    private boolean isEngineRunning = false;
    private int speed = 0;

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

    public String getEngineStatus() {
        return this.isEngineRunning ? "Engine is running" : "Engine is stopped";
    }

    public void startEngine() {
        this.isEngineRunning = true;
    }

    public void stopEngine() {
        this.isEngineRunning = false;
        this.speed = 0;
    }

    public String accelerate() {
        if (!this.isEngineRunning) {
            return "Engine is not running";
        }

        this.speed += 10;
        return "Car accelerating";
    }

    public String brake() {
        if (!this.isEngineRunning) {
            return "Engine is not running";
        }

        this.speed = this.speed - 10 < 0 ? 0 : this.speed - 10;

        return "Car braking";
    }

    public String getSpeed() {
        return this.speed + "km/h";
    }
}
