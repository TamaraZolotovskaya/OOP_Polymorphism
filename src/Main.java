import transport.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar("Lada",
                "Granta",
                1.7,
                null);
        PassengerCar passengerCar2 = new PassengerCar("Audi",
                "A8 50 L TDI quattro",
                3,
                PassengerCar.BodyType.SUV);
        PassengerCar passengerCar3 = new PassengerCar("BMW",
                "Z8",
                3,
                PassengerCar.BodyType.CROSSOVER);
        PassengerCar passengerCar4 = new PassengerCar("Kia",
                "Sportage 4-го поколения",
                2.4,
                PassengerCar.BodyType.UNIVERSAL);

        Bus bus1 = new Bus("VAZ",
                "Ф-12",
                3.1,
                Bus.Capacity.MEDIUM);
        Bus bus2 = new Bus("Mersedes",
                "РА234",
                5.5,
                Bus.Capacity.SMALL);
        Bus bus3 = new Bus("Subary",
                "НТ-2",
                4.3,
                Bus.Capacity.LARGE);
        Bus bus4 = new Bus("Honda",
                "АА",
                4.3,
                Bus.Capacity.EXTRALARGE);

        Truck track1 = new Truck("Volvo",
                "FH",
                4.1,
                Truck.LoadCapacity.N1);
        Truck track2 = new Truck("DAF",
                "XF",
                5.1,
                Truck.LoadCapacity.N2);
        Truck track3 = new Truck("Scania",
                "R730 V8",
                4.7,
                Truck.LoadCapacity.N3);

        Truck track4 = new Truck("Iveco",
                "S-Way",
                6.1,
                Truck.LoadCapacity.N2);


        bus1.pitStop();
        passengerCar1.bestLapTime();
        track1.maxSpeed();
        passengerCar1.start();

        DriverB sam = new DriverB("Sam", 18);
        sam.info(passengerCar1);
        sam.refuel(passengerCar1);
        sam.start(passengerCar1);
        sam.finish(passengerCar1);

        DriverC bill = new DriverC("Bill", 10);
        bill.info(track1);

        DriverD jack = new DriverD("Jack", 12);
        jack.info(bus1);

        System.out.println(Arrays.toString(PassengerCar.BodyType.values()));
        System.out.println(Arrays.toString(Truck.LoadCapacity.values()));
        System.out.println(Arrays.toString(Bus.Capacity.values()));

        passengerCar1.printType();
        track1.printType();
        bus1.printType();

    }
}