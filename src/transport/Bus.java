package transport;

public class Bus extends Transport implements Compete {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + "  начинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Автобус " + getBrand() + "  заканчивает движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Выводим лучшее время круга для автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Выводим максимальную скорость для автобуса " + getBrand() + " " + getModel());
    }

}
