import drivers.BusDriver;
import drivers.CarDriver;
import drivers.Driver;
import drivers.FreightCarDriver;
import transport.*;

import static transport.CarryingCapacity.*;

public class Main {
    public static void main(String[] args) {
        Transport<?>[] transports = new Transport<?>[]{
                new Car("Lada", "Vesta", 1.8, new CarDriver("Ivan", true, 5), TypeBody.SEDAN),
                new Car("Toyota", "Camry", 2.2, new CarDriver("Olga", true, 6), TypeBody.HATCHBACK),
                new Car("Hyundai", "Sonata", 0, new CarDriver("Anna", true, 10), TypeBody.COUPE),
                new Car("Kia", "Rio", 2.0, new CarDriver("Nikolai", true, 3), TypeBody.PICKUP),
                new Bus("ГАЗ", "газель NEXT A64R42", 0, new BusDriver("Oleg", true, 10), Capacity.ESPECIALLY_LARGE),
                new Bus("Toyota", "Coaster", 0, new BusDriver("Victor", true, 12), Capacity.AVERAGE),
                new Bus("Isusu", "A-09216", 0, new BusDriver("Petr", true, 18), Capacity.SMALL),
                new Bus("DAEWOO", "BS090", 0, new BusDriver("Elena", true, 14), Capacity.LARGE),
                new FreightCar("КамАЗ", "4308-А3", 0, new FreightCarDriver("Inna", true, 20), N1),
                new FreightCar("MAN", "TGL 12.180 4х2 BB", 0, new FreightCarDriver("Boris", true, 18), N2),
                new FreightCar("Mercedes-Benz", "Atego 818 8t", 0, new FreightCarDriver("Anton", true, 11), N3),
                new FreightCar("Hyundai", "HD 120", 0, new FreightCarDriver("Diana", true, 4), N2)
        };

        for (Transport<?> transport : transports) {
            printInfo(transport);
        }
        for (Transport<?> transport : transports) {
            System.out.println(transport.getType() + " " + transport.getBrand() + " " + transport.getModel());
            transport.printType();
        }
        for (Transport<?> transport : transports) {
            transport.goDiagnosed();
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getNameDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }


}
