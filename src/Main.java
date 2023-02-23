import drivers.BusDriver;
import drivers.CarDriver;
import drivers.Driver;
import drivers.FreightCarDriver;
import transport.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static transport.CarryingCapacity.*;

public class Main {
    public static void main(String[] args) {
        List<Mechanics> mechanicsForCar = new ArrayList<>();
        mechanicsForCar.add(new Mechanics("Иванов Иван", "Company1"));
        mechanicsForCar.add(new Mechanics("Семенов Семен", "Company2"));
        mechanicsForCar.add(new Mechanics("Федоров Федор", "Company3"));
        List<Mechanics> mechanicsForBus = new ArrayList<>();
        mechanicsForBus.add(new Mechanics("Дмитриев Дмитрий", "Company4"));
        mechanicsForBus.add(new Mechanics("Александров Александр", "Company2"));
        mechanicsForBus.add(new Mechanics("Ильин Илья", "Company3"));
        List<Mechanics> mechanicsForTracks = new ArrayList<>();
        mechanicsForTracks.add(new Mechanics("Савельев Савва", "Comnamy6"));
        mechanicsForTracks.add(new Mechanics("Петров Петр", "Company7"));
        mechanicsForTracks.add(new Mechanics("Алексеев Алексей", "Company1"));
        Transport<?>[] transports = new Transport<?>[]{
                new Car("Lada", "Vesta", 1.8, new CarDriver("Ivan", true, 5), mechanicsForCar, TypeBody.SEDAN),
                new Car("Toyota", "Camry", 2.2, new CarDriver("Olga", true, 6), mechanicsForCar, TypeBody.HATCHBACK),
                new Car("Hyundai", "Sonata", 0, new CarDriver("Anna", true, 10), mechanicsForCar, TypeBody.COUPE),
                new Car("Kia", "Rio", 2.0, new CarDriver("Nikolai", true, 3), mechanicsForCar, TypeBody.PICKUP),
                new Bus("ГАЗ", "газель NEXT A64R42", 0, new BusDriver("Oleg", true, 10), mechanicsForBus, Capacity.ESPECIALLY_LARGE),
                new Bus("Toyota", "Coaster", 0, new BusDriver("Victor", true, 12), mechanicsForBus, Capacity.AVERAGE),
                new Bus("Isusu", "A-09216", 0, new BusDriver("Petr", true, 18), mechanicsForBus, Capacity.SMALL),
                new Bus("DAEWOO", "BS090", 0, new BusDriver("Elena", true, 14), mechanicsForBus, Capacity.LARGE),
                new FreightCar("КамАЗ", "4308-А3", 0, new FreightCarDriver("Inna", true, 20), mechanicsForTracks, N1),
                new FreightCar("MAN", "TGL 12.180 4х2 BB", 0, new FreightCarDriver("Boris", true, 18), mechanicsForTracks, N2),
                new FreightCar("Mercedes-Benz", "Atego 818 8t", 0, new FreightCarDriver("Anton", true, 11), mechanicsForTracks, N3),
                new FreightCar("Hyundai", "HD 120", 0, new FreightCarDriver("Diana", true, 4), mechanicsForTracks, N2)
        };

        List<Transport> transportList = new ArrayList<>();
        for (Transport<?> transport : transports) {
            transportList.add(transport);
        }
        getNameDriverFromList(transportList, 4);
        getMechanicsFromList(transportList, 8);
        ServiceStation queueOfTransports = new ServiceStation();
        queueOfTransports.addTransports(transportList.get(0));
        queueOfTransports.addTransports(transportList.get(5));
        queueOfTransports.addTransports(transportList.get(8));
        queueOfTransports.carryOutATechnicalInspection();
        Set<Driver> driverSet = new HashSet<>();
        for (Transport transport : transportList) {
            driverSet.add (transport.getDriver());
        }
        System.out.println(driverSet);
        driverSet.add (transportList.get(1).getDriver());
        driverSet.add (transportList.get(0).getDriver());
        System.out.println(driverSet);
    }
    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getNameDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    public static void getNameDriverFromList(List<Transport> transportList, int index) {
        System.out.println(transportList.get(index).getDriver().getNameDriver());
    }

    public static void getMechanicsFromList(List<Transport> transportList, int index) {
        System.out.println(transportList.get(index).getMechanicsList());
    }


}
