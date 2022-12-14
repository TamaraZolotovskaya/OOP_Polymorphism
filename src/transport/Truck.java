package transport;

public class Truck extends Car implements Compete {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Легковой автомобиль " + getBrand() + "  заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Выводим лучшее время круга для грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Выводим максимальную скорость для грузового автомобиля " + getBrand() + " " + getModel());
    }


}
