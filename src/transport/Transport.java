package transport;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import driver.Driver;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private ArrayList<Driver<?>> drivers = new ArrayList<Driver<?>>();
    private ArrayList<Sponsor> sponsors = new ArrayList<Sponsor>();
    private ArrayList<Mechanic<?>>  mechanics = new ArrayList<Mechanic<?>>();


    public Transport(String brand,
                     String model,
                     double engineVolume) {
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

    public void addDrivers(Driver<?> driver) {
        if (drivers.size() < 1) {
            drivers.add(driver);
        } else {
            try {
                throw new RuntimeException("У автомобиля может быть только один водитель");
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void addSponsors(Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public  void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public ArrayList<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public ArrayList<Sponsor> getSponsors() {
        return sponsors;
    }

    public ArrayList<Driver<?>> getDrivers() {
        return drivers;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean servise();

    public void PrintPeopleInfo() {
        System.out.println("Aвтомобиль "+ getBrand()+" "+ getModel()+"\n"+
                           "водитель: "+ getDrivers().get(0).getName());
        System.out.print("спонсоры: ");
        for(Sponsor sponsor: getSponsors())
        {
            System.out.print(sponsor.getName()+" ");
        }
        System.out.print("\n"+"механики: ");
        for(Mechanic<?> mechanic: getMechanics())
        {
            System.out.print(mechanic.getName()+" ");
            System.out.println(" ");
        }
    }

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
        if (Double.compare(engineVolume, 0D) == 0) {
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
