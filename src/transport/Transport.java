package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (StringUtils.IsNullOrBlank(brand)) {
            brand = "default";
        }
        this.brand = brand;

        if (StringUtils.IsNullOrBlank(model)) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 00) == 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return getClass() +
                ", " + brand +
                ", " + model +
                ", объем двигателя" + engineVolume + "\n";
    }
}
