import transport.StringUtils;
import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean IsLicense;
    private int experience;

    public Driver(String name, int experience) {
        if (StringUtils.IsNullOrBlank(name)) {
            name = "Водитель";
        }
        this.name = name;
        IsLicense = true;
        setExperience(experience);
    }

    public void start(T transport) {
        transport.start();
    }

    public void finish(T transport) {
        transport.finish();
    }

    public void refuel(T transport) {
        System.out.println("Водитель " + getName() + " заправляет автомобиль " + transport.getBrand());
    }

    public void info(T transport) {
        System.out.println("Водитель " + name + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }

    public void setLicense(boolean license) {
        IsLicense = license;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            experience = Math.abs(experience);
        }
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isLicense() {
        return IsLicense;
    }

    public int getExperience() {
        return experience;
    }


}
